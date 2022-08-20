import java.util.Arrays;

public class QuickSort {
    static int[] a = {8,4,6,9,7,1};
    public static void main(String args[]){
        sort(0,a.length-1);
        System.out.println(Arrays.toString(a));
        
    }

    static void sort(int l,int r){
        if(l<r){
            int j = partition(l,r);
            sort(l,j);
            sort(j+1,r);
        }
    }

    static int partition(int l, int r){
        int pivot = a[l];
        int i = l;
        int j = r;
        while (i<j) {
            do{
                i++;
            }while(a[i]<=pivot);
            
            do{
                j--;
            }while(a[j]>pivot);
            
            if(i<j){
                swap(i,j);
            }
        }
        swap(l,j);
        return j;

    }

    static void swap(int x,int y){
        int temp = a[x];
        a[x]= a[y];
        a[y]= temp;
    }
}
