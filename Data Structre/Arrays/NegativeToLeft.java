import java.util.Arrays;

public class NegativeToLeft {
    public static void main(String[] args) {
       int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6}; 
       int n = arr.length;
       Solution s = new Solution();
       //Before solution
       System.out.println(Arrays.toString(arr));
       
       s.negativeLeft(arr, n);
       
       //After solution
       System.out.println(Arrays.toString(arr));
       

    }
}

class Solution{
    public static void negativeLeft(int[] arr , int n){
        
    }
}
