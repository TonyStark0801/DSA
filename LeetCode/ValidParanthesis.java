/**
 * ValidParanthesis
 */
public class ValidParanthesis {
    public static void main(String[] args) {

        String s = "([)]";
        Solution sl = new Solution();
        System.out.println(sl.isValid(s));
    }
    
}



class Solution {
    public boolean isValid(String s) {
        int i =0;
        int roundBracket=0;
        int squareBracket=0;
        while (i<s.length()) {
            if(roundBracket < 0 || squareBracket < 0){
                return false;
            }
            char c =s.charAt(i);
            if(c=='('){
                roundBracket++;
            }
            if(c==')'){
                roundBracket--;
            }
            if(c=='['){
                squareBracket++;
            }
            if(c==']'){
                squareBracket--;
            }
            i++;   
        }
        return squareBracket==0 && roundBracket==0 ;
    }
}