public class MinJump {
    public static void main(String[] args) {
        int[] a = {2,3,1,1,2,4,2,0,1,1};
        int n = a.length;
        int i = 0;
        int j = 0;
        // if(n==1){
        //     return -1;
        // }
        while (i<n) {
            System.out.println("i: "+i+" "+"j:"+j+" a[i]: "+a[i]);
            if(a[i]==0){
                break;
            }
            i+=a[i];
            j++;
            if(i==n-1){
                j--;
            }
        }
        // if(i>n){
        //     j--;
        // }
    
        System.out.println(j);
    }
}
