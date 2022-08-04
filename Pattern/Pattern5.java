/*
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 */

public class Pattern5 {
    public static  void main(String args[]){
        int n = 4;
        int row=1;
        int value = 1;
        while(row<=n){
            int col=1;{
                while(col<=row){
                    System.out.print(value++ + " ");
                    col++;
                }
                System.out.println();
                row++;
            }
        }

    }
}
