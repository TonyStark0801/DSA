import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int[] nums={9,5,1,4,3,4,5,7,7,22};
        int temp;
        for(int key=1 ; key<nums.length;key++){
            for(int i=0;i<key;i++){
                if(nums[i]>nums[key]){
                    temp=nums[i];
                    nums[i]=nums[key];
                    nums[key]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
