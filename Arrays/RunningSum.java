/*
Author : Shubham Mishra
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Link: https://leetcode.com/problems/running-sum-of-1d-array/
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        // int[] nums = {1,1,1,1};
        int prev=nums[0];
        for(int i = 1;i<nums.length;i++){
            nums[i]+=prev;
            prev = nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
