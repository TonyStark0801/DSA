/*
The complement of an integer is the integer you get when you flip all the 0's to 1's 
and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" 
which is the integer 2.
Given an integer n, return its complement.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
Example 3:

Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 

Constraints:

0 <= n < 109
*/

// public class ComplementOfBase10 {
//     public static void main(String args[]){
//         int n = 10;
//         int bits = Integer.toBinaryString(n).length();
//         int compliment  = (int)Math.pow(2, bits)-1;
//         System.out.println(n^compliment);

//         /*
//          * This works but we need more optimal soltution.
//          */

//     }
// }



//Approach2


public class ComplementOfBase10 {
    public static void main(String args[]){
        int n = 0;   //101
        int mask=0;  //000
        int temp=n;
        if(n==0){
            // return 1;
            System.out.println(1);
            System.exit(1);  // We are not using so usign this method to stop the code
        
        }
        while(temp!=0){
            mask = mask<<1 | 1;   // Left shift mask by 1 postion and or with 1 to add 1.
            temp=temp>>1;             //Right shift n till the MSB 1 get  to the right most (We are counting
                                                // the number of n's we require)
        }
         
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(mask));
        

        // Now XOR mask 111... and n to get 1's compliment
        System.out.println(n^mask);
        //return  n^mask;
    }
}
