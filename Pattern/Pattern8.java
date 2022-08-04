public class Pattern8 {
    
    public static void main(String args[]){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(n-j+" ");
            }

            // for(int k=1;k<=i;k++){
            //     System.out.print(k+" ");
            // }

            // for(int l=i-1;l>=1;l--){
                // System.out.print(">>"+l);
            //     System.out.print(l+" ");
            // }

            System.out.println();
        }

        
    }
}

