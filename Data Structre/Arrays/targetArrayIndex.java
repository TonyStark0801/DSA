import java.util.Arrays;

public class targetArrayIndex {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }


    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int n = arr.length;
        
        if(n==0){
            return ans;
        }
        
        int i=0;
        while(i<n-1 && arr[i]!=target){
            i++;
        }
        if(i==n-1 && arr[i]!=target){
            return ans;
        }

        ans[0]=i;
        while (i<n && arr[i]==target) {
            i++;
        }

        ans[1]=i-1;
        
        return ans;
    }
    
}
