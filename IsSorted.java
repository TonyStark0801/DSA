/*
 * Given an array tell whether it is sorted or not.
 * Retrun Boolean value
 * 
 * 
 * Narrow down the arrow until only one or no item remains in the array.
 * Single element is always sorted so return true. 
 * compare the first two element of the array if not sorted return false.
*/



public class IsSorted {
    public static void main(String args[]){
        int[] arr = {9,2,3,4};
        int size = arr.length;
        System.out.println(isSorted(arr,0,size));
    }

    static boolean isSorted(int[] arr ,int left, int size ){
    
        if(size == 1 || size ==0){
            return true;
        }

        if(arr[left]>arr[left+1]){
            return false;
        }

        return isSorted(arr,left+1, size-1);
    }
}
