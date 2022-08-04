
/*
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
*/

public class Pattern4{
    public static void main(String argsp[]){
        int n = 4; // Number of rows  you want to print.
        int i = 1;
        while(i<=n){
            int j =1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
