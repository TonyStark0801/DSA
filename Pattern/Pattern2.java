/* 
* 1 2 3 
* 4 5 6 
* 7 8 9 
*/

public class Pattern2 {
    public static void main(String args[]){
        int N = 3; int i=1; int k =1;
        while(i<=N){
            int j =1;
            while(j<=N){
                System.out.print(k++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
