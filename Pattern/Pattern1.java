/*
 * 1 2 3 4 
 * 1 2 3 4 
 * 1 2 3 4 
 * 1 2 3 4 
*/
public class Pattern1 {
    public static void main(String[] args) {
        int N = 4;
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=N){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
