
//Find the number which is not repeating in the array

import java.util.ArrayList;

public class FindNonDupli {
    
    public static void main(String[] args) {
        int[] nums = {7,1,5,7,5,1,25,25,65};
        ArrayList<Integer> non = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            boolean repeated = false;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    repeated=true;
                    break;
                }
            }
            if (!repeated) {
                non.add(nums[i]);
            }
        }

        System.out.println(non);
        
    }
}
