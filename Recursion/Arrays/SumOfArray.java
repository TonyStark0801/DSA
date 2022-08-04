/*
 * Return sum of array using recursion.
 * 
 * 
 * 
 * Get the first element(left) and sum up with the rest of the 
 * array(Calling the same function again).
 * Do this till you have only one element left. 
 * Then return that last element and volla you have your sum.
*/
package Arrays;

public class SumOfArray {
    static int s = 0;
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr,0,arr.length));
    }

    static int sum(int[] a,int left,int size){
        // If there is empty array return sum as 0(Zero).
        if(size==0){
            return 0;
        }
        
        if(size == 1){
            return a[left];
        }
        return a[left]+sum(a,left+1,size-1);
    }
}
