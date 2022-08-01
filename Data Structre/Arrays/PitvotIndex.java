// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.

 

// Example 1:

// Input: nums = [1,7,3,6,5,6]
// Output: 3
// Explanation:
// The pivot index is 3.
// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11
// Example 2:

// Input: nums = [1,2,3]
// Output: -1
// Explanation:
// There is no index that satisfies the conditions in the problem statement.
// Example 3:

// Input: nums = [2,1,-1]
// Output: 0
// Explanation:
// The pivot index is 0.
// Left sum = 0 (no elements to the left of index 0)
// Right sum = nums[1] + nums[2] = 1 + -1 = 0
 



public class PitvotIndex {
    public static void main(String[] args) {
        int[] nums= {1,0};
        System.out.println(pivot(nums));
        

    }
    static int pivot(int nums[]){
        int[] sumArray = new int[nums.length];
        int sum;
        int right;
        int left;
        sumArray[0]=nums[0];
    
        for(int i=1;i<nums.length;i++){
            sumArray[i]= nums[i]+sumArray[i-1];
        }
        sum = sumArray[sumArray.length-1];

        for(int i=0;i<nums.length;i++){
            // * calculate the right sum (all elements right to the pivot)
            right=sum-sumArray[i];
            
            // * calculate the left sum (all elements left to the pivot)
            if(i==0)
                // * if start index, set left sum to 0
                left=0;
            else
                left = sumArray[i-1]; 
            // * check if right sum is equal to left sum -> return current index  
            if(right ==left){
                return i;
            }
        }
        // * -1 <- if not found
        return -1;

    }


    //Second Approach
    static int pivot2(int nums[]){
        int sum=0;
        int right;
        int left=0;
        
        for (int i : nums) {
            sum+=i;
        }
        

        for(int i=0;i<nums.length;i++){

            right=sum-(left+nums[i]);
            
            if(right ==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;

    }


 
}



// *Approach
/*
 * 1 - calculate the sum of array <- sum
 * 2 - find the pivot
 * 
 */


 /*
 
Create a Sum Array[] which will store sum from left !
sum of 1
sum of 1,2
sum of 1,2,3
sum of 1,2,3,4

now iterate and select element as pivot index and subtract each sum from main 
sum which will in return give the right sum.
Basically we have the left sum and subtracting it from the main sum
to get the right sum. When we compare left and right. if found same. That's our pivot index

*/