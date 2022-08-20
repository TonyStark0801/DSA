public class KthlargestElem {
    
    static class Node{
        int data;
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

        public void sort(int a[],int k){
            int n = a.length;
            while(k>0){
                swap(a,0, n-1);
                k--;
                n--;
                heapify(a, n, 0);
            }
        }
        
    }
    
    public static int findKthLargest(int[] arr, int k) {
        BinaryTree tree = new BinaryTree(); 
        tree.buildTree(arr);
        tree.sort(arr,k);
        return arr[arr.length-k];
    }


    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 4;
        System.out.println(findKthLargest(arr,k));
    }
}