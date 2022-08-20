//Finding first unique character
public class Main {
    public static void main(String[] args) {
        String s = "abcrccbaccg";

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j==i){
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                if(j==s.length()-1 && s.charAt(j)!=s.charAt(i)){
                    System.out.println(s.charAt(i));
                }
            }

        }
    }
}
