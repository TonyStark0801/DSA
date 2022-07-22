import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String[] args) {
        // int[] a = {1,5,8,10}; int k =2;
        // int[] a={1,5,15,10}; int k = 3;
        // int[] a = {2,6,3,4,7,2,10,3,2,1}; int k =5;

        // int[] a = {3,9,12,16,20};    int k =3;
        int[] a = {1,2,3}; int k =2;
        // int[] a= {6,10}; int k = 3; //  {9,7 } success

        
    
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

        int diff = a[n-1]-a[0];
        // min +=k;
        // if(max-k>0){
        //     max -=k;
        // }
        
        int c,dec,inc;
        System.out.println(Arrays.toString(a));

        for(int i=0;i<n;i++){
            c=a[i];
            dec = c-k;
            inc = c+k;
            
            if(dec<0){
                a[i]=inc;
                min = a[i];
                diff = max-min;
            }
            if(inc > max && inc-min > max-min){
                // System.out.println(max+" "+a[i]);
                a[i]=dec;
                max = a[i];
                diff = max -min;
                
            }
            if(dec < min && max-dec < max-min){
                min = dec;
                diff = max-dec;
                a[i]=dec;

            }
            else if(inc <=max){
                a[i]=inc;
                max = a[i];
            }
        }

        System.out.println(Arrays.toString(a));
        // System.out.println(max+" "+min);
        System.out.println(max+" "+min);
        


    }
}
