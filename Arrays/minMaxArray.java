// *To Find Minimux and Maximum element in the given array */
// @author: Shubham Mishra

public class minMaxArray {
    public static void main(String[] args) {
        // ?Given Aray 
        int[] arr = {2,6,7,4,8,8,0,3,200,34,34343,6,-1};
        
        int min,max;
        max = arr[0];               // ?Track : i
        min = arr[arr.length-1];    // ?Track : j

        for(int i = 0,j=arr.length-1;i<j;i++,j--){
            // ?Finding MiniMum
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[j]<min){
                min = arr[j];
            }

            // ?Finding MaXinmum
            if(arr[j]>max){
                max = arr[j];
            }
            else if(arr[i]>max){
                max = arr[j];
            }
        }

        System.out.println("Max: "+max+"\n"+"Min: "+min);
        
        //*Output */
        // Max: 34343
        // Min: -1
    
    }
    

}
