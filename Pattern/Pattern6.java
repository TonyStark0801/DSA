/* 
* 1 
* 2 1 
* 3 2 1 
* 4 3 2 1 
* 5 4 3 2 1 
* 6 5 4 3 2 1 
* 7 6 5 4 3 2 1 
* 8 7 6 5 4 3 2 1 
* 9 8 7 6 5 4 3 2 1
*/

public class Pattern6 {
    public static void main(String args[]){
        int n = 9;
        int row = 1;
        while(row<=n){
            int col = row;
            while(col>=1){
                System.out.print(col+" ");
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
