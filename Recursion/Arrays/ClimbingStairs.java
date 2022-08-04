/*Working fine with recursion but
 * !TIME LIMIT EXCEEDED
 * for N = 45 >> 1836311903
 * so we will use DP .
 * https://leetcode.com/problems/climbing-stairs/submissions/
*/

package Arrays;

public class ClimbingStairs {
    public static void main(String args[]){
        int N = 45;
        System.out.println(steps(N));
    }

    static int steps(int n){
        
        if(n<0){
            return 0;
        }
        
        if(n==0){
            return 1;
        }
        return steps(n-1)+steps(n-2);
        
        
        
    }
}
