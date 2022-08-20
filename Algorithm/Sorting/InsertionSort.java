import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int[] nums={9,5,1,4,3,4,5,7,7,22};
        int temp;
        //selecting key
        for(int key=1 ; key<nums.length;key++){
            int i =0;
            while (i<key && nums[key]<nums[i]) {
                    
                    //Shifting elements to the right by swapping.
                    temp=nums[i];
                    nums[i]=nums[key];
                    nums[key]=temp;
                    i++;
                }
        }
        System.out.println(Arrays.toString(nums));
    }
}
