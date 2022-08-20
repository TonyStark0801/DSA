import java.util.Arrays;

public class MatrixProblem {
    public static void main(String args[]){
        int n = 3;
        int k =1;
        int[][] s = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j] = k++;
            }
        }

        //Prnting matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){                   // Here lies the whole solution               
                sum+=s[i][j];                           
                }                                       
            }
        }

        System.out.println(s.length);
    }
}
