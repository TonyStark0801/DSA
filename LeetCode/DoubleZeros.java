import java.util.Arrays;

public class DoubleZeros{
  public static void main(String args[]){
    Solution s = new Solution();

    int[] arr = {1,0,2,3,0,4,5,0};
    System.out.println(Arrays.toString(arr));
    s.duplicateZeros(arr);
    System.out.println(Arrays.toString(arr));
    
  }
}

class Solution {
  public void duplicateZeros(int[] arr) {
    int n = arr.length;
    for(int i=0;i<n;){
      if(arr[i]==0 ){
        shiftRight(arr, i);
        i++;
      }
      i++;
    }
  } 
  
  public void shiftRight(int[] arr ,int index ){
    for(int i=arr.length-2;i>=index;i--){
      arr[i+1]=arr[i];
    }
  }
}

