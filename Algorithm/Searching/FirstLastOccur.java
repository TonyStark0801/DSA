

import java.util.ArrayList;

public class FirstLastOccur {
  public static int interpolationSearch(int arr[], int lo,int hi, int x)
  {
    int pos;

    pos = lo + (((hi - lo) * (x - arr[lo]))/ (arr[hi] - arr[lo]));

    if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
      pos = lo + (((hi - lo) * (x - arr[lo]))/ (arr[hi] - arr[lo]));
      if (arr[pos] == x)
        return pos;

      if (arr[pos] < x)
        return interpolationSearch(arr, pos + 1, hi,x);

      if (arr[pos] > x)
        return interpolationSearch(arr, lo, pos - 1,x);
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={1,4};
    int n = arr.length;
    int x = 4;
    int F, L;
    ArrayList<Integer> ret = new ArrayList<>(); 
    
    if(arr[0]==x && arr[n-1]==x){
        ret.add(0);
        ret.add(n-1);
        // return ret;
    }
    F = L= interpolationSearch(arr, 0, n-1, x);
    
    if(F==-1){
        ret.add(-1);
        // return ret;
    }
    else{
        for(int i =F;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                ret.add(F);
                ret.add(L);
                break;
                // return ret;
            }
            L++;
        }
    }
    System.out.println(ret);
  }
}
