/*
 * Check if the key exists in the array(Linear Search).
 * 
 * 
 * check the left most element if matched return True or incement left and decrease
 * size to narrow down the array . If the arrow size is 0 which means the element is 
 * not present you can return False.
 */




public class LinearSearch {
    public static void main(String args[]){
        int[] arr = {4,7,5,2,3,4,0,1,25777};
        int key = 25777;
        System.out.println(isFound(arr,key,0,arr.length));
    }

    static boolean isFound(int[] arr, int key, int left, int size){
        if(size==0){
            return false;
        }
        
        if(arr[left]==key){
            return true;
        }
        return isFound(arr, key, left+1, size-1);
        
    }
}

