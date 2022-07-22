import java.util.Arrays;
public class BubbleSort {

    public static void main(String args[]){
        boolean swapped=false;
        int temp;
        int[] arr ={6,8,3,8,49,2,4,6,7};
        for(int i=0;i<arr.length;i++){
            for(int j =0; j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
        

}
