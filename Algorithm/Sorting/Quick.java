import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] nums = {8,4,6};
        System.out.println(Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        
    }

    static void quickSort(int[] nums, int low ,int high){

        if(low>=high){
            return;
        }

        int pivotIndex = partition(nums, low, high);
        quickSort(nums, low, pivotIndex-1);
        quickSort(nums, pivotIndex+1, high);
    }


    static int partition(int[] nums, int low , int high){
        int pivot = nums[high];
        int pivotIndex = high;


        while(low < high){
            while (nums[low]<=pivot && low < high) {
                low++;
            }
            while (nums[high]>=pivot && high > low) {
                high-- ;
            }
            swap(nums, low,high);
        }
        swap(nums, low, pivotIndex);
        return low;
    }

    static void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x]= nums[y];
        nums[y]= temp;
    }
   
}
