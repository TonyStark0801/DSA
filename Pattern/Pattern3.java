// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

public class Pattern3 {
    public static void main(String args[]){
        // System.out.println(2);
        int n =5;
        int i =0;
        while(i < n){
            int j =0;
            while(j<=i){
                System.out.print("* ");
                j++;                
            }
            System.out.println();
            i++;
        }
    }
}
