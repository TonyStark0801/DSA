import java.util.Arrays;

public class miniMize {
    public static void main(String[] args) {
        // int[] a = {1,2,3}; int k =2;
                //{3,4,5}
        // int [] a = {1,10,14,14,15}; int k=6;   
                // {7 4  8  8  9} 5
        // int[] a  = {6,10}; int k = 3;
        int[] a = {2,6,3,4,7,2,10,3,2,1}; int k= 5;
        
        int n = a.length;
        int min,max;
        max = a[0];               
        min = a[n-1]; 

        for(int i = 0,j=n-1;i<j;i++,j--){

            // ?Finding MiniMum
            if(a[i]<min){
                min = a[i];
            }
            if(a[j]<min){
                min = a[j];
            }

            // ?Finding MaXinmum
            if(a[j]>max){
                max = a[j];
            }
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println(Arrays.toString(a));
        int curr;
        for(int i=0;i<n;i++){
            curr = a[i];
            if(curr <=min){
                a[i]+=k;
                min = a[i];
            }

            else if (curr+k > max && max-min>=((curr+k)-min) && ((curr+k)-min)> 0){
                a[i]+=k;
                max=a[i];
            }else{
                a[i]-=k;
                max=a[i];
            }
            

        }
        System.out.println(Arrays.toString(a));
        System.out.println("Min: "+min+" Max: "+max);
    }
}
