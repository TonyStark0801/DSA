/*
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] ≤ 107
 */

 // * kadane's Algorithm
public class MaxContiguousSubArray {
    public static void main(String[] args) {
        int[] a = {-1,-2,-3,-4};

        int max = Integer.MIN_VALUE; 
        int cur = 0;
        for (int i = 0; i < a.length; i++) {
            cur += a[i];
            if(cur > max){
                max = cur;
            }
            if(cur < 0) {
                cur = 0;
            }
        }
        System.out.println(max);
    }
}