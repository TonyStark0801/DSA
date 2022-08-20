import javax.xml.transform.Source;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go 
 * outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:
 
Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:
-231 <= x <= 231 - 1
*/


public class ReverseInteger{
    public static void main(String args[]){
        int n = 153423;
                
        long ans = 0;
        while(n!=0){
            int digit = n%10;
            ans = ans*10 + digit;
            n = n/10;
        }
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE ){
            System.out.println(0);
        } 
        else
        System.out.println((int)ans);
    }
}



/*
 * Problem arrived with 1534236469 while reverse when it went out of range of 
 * Integer limit there is some garbage value cause datatype for the ans was int.
 * Make it long to acomodate more values then compare with intMin and intMax.
 */



 //Approach 2
//  class Solution {
//     public int reverse(int n) {
//         int ans = 0;
//         while(n!=0){
//             int digit = n%10;
//             if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
//                 return 0;
//             }
//             ans = ans*10 + digit;
//             n = n/10;
//         }
        
//         return ans;
//     }
// }
