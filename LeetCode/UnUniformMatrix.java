public class UnUniformMatrix {
    public static void main(String args[]){

        int[][][] a = new int[3][][];
        a[0] = new int[3][2];
        a[1] = new int[2][2];
        a[2] = new int[1][2];
        int l = 1;
        
        for(int i =0;i<3;i++){
            for(int j=0;j<3-i;j++){
                for(int k = 0; k<2;k++)
                a[i][j][k]=l++;
            }
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print("[");
                for(int k = 0; k<2;k++){
                    if(k==1){
                        System.out.print(a[i][j][k]);    
                    }
                    else
                    System.out.print(a[i][j][k]+",");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }
}
