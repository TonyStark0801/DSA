
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

    /*Approach 2 
        public static void main(String[] args) {
            int[] nums = {7,1,5,7,5,1,25,23,25};
            Hashtable<Integer,Boolean> hash = new Hashtable<>();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int x : nums){
                if(!hash.containsKey(x)){
                    hash.put(x,false);
                }
                else{
                    hash.put(x, true);
                }
                    
            }
            
            for(int x : hash.keySet()){
                if (!hash.get(x)) {
                    arr.add(x);
                }
            }
            System.out.println(arr);
        }
    */



}
