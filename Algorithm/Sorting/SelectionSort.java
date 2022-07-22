/* Selection Sort */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] nums = {5,1,20,4,3,2,9};
        int minimum,temp;
        
        //Iterating
        for(int i=0 ; i<nums.length ;i++){
            
            //Selecting Minimum
            minimum = i;
            for(int j=i+1; j < nums.length ; j++){
                if(nums[j] < nums[minimum]){
                    minimum = j;
                }
            }   

            //swaping;
            temp = nums[i];
            nums[i]=nums[minimum];
            nums[minimum]=temp;

        }
        System.out.println(Arrays.toString(nums));
    }
}
