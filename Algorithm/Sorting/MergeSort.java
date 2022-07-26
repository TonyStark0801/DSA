/* Pass the given array to divide function it will recusively divide the array into left sub aray and right sub array
* till you
*/ 







import java.util.Arrays;

public class MergeSort{
    
    public static void main(String[] args) {
        int[] arr = {6,5,12,10};
        //Before
        System.out.println(Arrays.toString(arr));
        
        divide(arr);
        
        //after
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] a){
        int size = a.length;
        if(size>=2){

            int mid = size/2;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int[size - mid];
    
            for (int i = 0; i < mid; i++) {
            leftHalf[i] = a[i];
            }

            for (int i = mid; i < size; i++) {
                rightHalf[i - mid] = a[i];
            }

            divide(leftHalf);
            divide(rightHalf);
            merge(a,leftHalf, rightHalf);
        }

    }

    static void merge(int[] a,int[] leftHalf,int[] rightHalf){
        
        int i =0;
        int j = 0;
        int k = 0;
        
        while(i<leftHalf.length && j<rightHalf.length){
            if(leftHalf[i]<=rightHalf[j]){
                a[k]=leftHalf[i];
                i++;
            }
            else{
                a[k]=rightHalf[j];
                j++;

            }
            k++;
        }
        
        while (i<leftHalf.length) {
            a[k]=leftHalf[i];
                k++;i++;
        }
        
        while (j<rightHalf.length) {
            a[k]=rightHalf[j];
                k++;j++;

        }
        
       
    }
}