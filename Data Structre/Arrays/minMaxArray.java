// *To Find Minimux and Maximum element in the given array */
// @author: Shubham Mishra

public class minMaxArray {
    public static void main(String[] args) {
        // ?Given Aray 
        int[] arr = {1,5,43,67,89};
        
        int min,max;
        int n = arr.length;
        min = arr[0];               // ?Track : i
        max = arr[n-1];    // ?Track : j

        for(int i = 0,j=n-1;i<j;i++,j--){
            // ?Finding MiniMum
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[j]<min){
                min = arr[j];
            }

            // ?Finding MaXinmum
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max: "+max+"\n"+"Min: "+min);
        
        //*Output */
        // Max: 34343
        // Min: -1
    
    }
    

}
