import java.util.Arrays;


public class T3DArray {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1,2,3,4,5};
        int[] M ={2,3,9};
        int [][] matrix = new int[N-1][];
        for (int j = 0; j < N-1; j++) {
            for (int i = N-1; i>0; i--) {
                // matrix[j][]= new int[i];
            }
        }
        for (int j = 0; j < N-1; j++) {
            for (int i = 0; i <N-1-j; i++) {
                matrix[j][i] = 1;
                System.out.println(Arrays.toString(matrix[j]));
            }
        }
    }
}



















// // create a 3d array
// int[][][] test = {
//     {
//         {1,2},{1,3},{1,4},{1,5},
//     }, 
//     { 
//         {2,3},{2,4},{2,5}
//     },
//     {
//         {3,4},{3,5},
//     },
//     {
//         {4,5}
//     }
// };

// // for..each loop to iterate through elements of 3d array
// for (int[][] array2D: test) {
//     for (int[] array1D: array2D) {
//         System.out.print(Arrays.toString(array1D));
//         // System.out.print("[");
//         // for(int item: array1D) {
//         //     System.out.print(item);
//         // }
//         // System.out.print("]");
//     }
//     System.out.print("\n");
// }
