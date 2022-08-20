import java.util.ArrayList;
import java.util.Arrays;

public class Heap {

    static class Node{
        Integer data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree{
        public void  buildTree(int a[]){
            int n = a.length;
            for(int i = (n/2)-1;i>=0;i--){
                heapify(a, n, i);
            }
        }

        public void heapify(int a[], int n ,int i){  //index -> currentIndex
            int largest = i;
            int leftChild = 2*i+1;
            int rightChild = 2*i+2;

            if(leftChild < n && a[leftChild ]>a[largest]){
                largest = leftChild;
            }
            
            if( rightChild < n && a[rightChild]>a[largest]){
                largest = rightChild;
            }
            
            if(largest != i){
                swap(a,largest,i);
                heapify(a, n, largest);
            }
            
        }
        public void swap(int[] a , int x , int y){
                int temp = a[x];
                a[x]=a[y];
                a[y]= temp;
        }

        public void sort(int a[]){
            int n = a.length;
            while(n>1){
                swap(a,0, n-1);
                n--;
                heapify(a, n, 0);
            }
        }

        
    }

   



    public static void main(String[] args) {
        int[] arr = {22,5,6,7,3,1,9,2,9,1,0};
        BinaryTree tree = new BinaryTree(); 
        System.out.println(Arrays.toString(arr));
        tree.buildTree(arr);
        System.out.println(Arrays.toString(arr));
        tree.sort(arr);
        System.out.println(Arrays.toString(arr));

        
        
        
    }

    public static void insert(int[] nums ,int n ,int  value){
        n+=1;
        
    }
}
