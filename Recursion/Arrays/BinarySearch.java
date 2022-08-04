// package Arrays;

/*
 * Implementing Binary Search using Recursion
 * Find key in sorted array.
*/


// public class BinarySearch {
//     public static void main(String args[]){
//         int[] arr = {1,2,4,5,6,7,10};
//         int size = arr.length;
//         int key = 50;
//         System.out.println(isFound(arr, key,0,size-1));
//     }

//     static boolean isFound(int arr[], int key, int left, int right){
//         int mid = (left+right)/2;
//         if(key == arr[mid]){
//             return true;
//         }
        
//         if(left==right && key !=arr[left]){
//             return false;
//         }
        
//         if(arr[mid]>key){
//             return isFound(arr, key, left, mid);
//         }
//         else{
//             return isFound(arr, key, mid+1, right);
//         }

//     }
// }


public class BinarySearch {
    public static void main(String args[]){
        int[] LST = {1,2,4,5};
        // int size = arr.length;
        int key = 2;
        System.out.println(exists(LST, key));
    }

    static boolean exists(int LST[], int x){
        int left =0; int right = LST.length-1;
        boolean result = false;
        while(left<=right ){
        
            int mid = (left+right)/2;
             
            if(x == LST[mid]){
                result = true;
                break;
            }
            if(LST[mid]>x){
                right = mid;
            }
            if(LST[mid]<x){
                left  = mid+1;
            }            

        }
        return result;

    }
}
