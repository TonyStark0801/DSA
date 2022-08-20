/*
1 2 3 4 5 5 4 3 2 1 
1 2 3 4 * * 4 3 2 1 
1 2 3 * * * * 3 2 1 
1 2 * * * * * * 2 1 
1 * * * * * * * * 1 
*/

public class test{
    public static void main(String args[]){
        int n = 5;
        for(int i =0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print((n-j)+1+" ");
            }

            for(int s=0;s<i*2;s++ ){
                System.out.print("* ");
            }

            for(int j=n-i;j>0;j--){
                System.out.print((j)+" ");
            }

            System.out.println();
        }
    }
}
