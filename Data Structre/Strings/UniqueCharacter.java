import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "abcrccbaccgggr";

        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<s.length();j++){
        //         if(j==i){
        //             continue;
        //         }
        //         if(s.charAt(i)==s.charAt(j)){
        //             break;
        //         }
        //         if(j==s.length()-1 && s.charAt(j)!=s.charAt(i)){
        //             System.out.println(s.charAt(i));
        //         }
        //     }

        // }



        HashMap<Character,Integer> a = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(a.containsKey(c)){
                a.put(c,a.get(c)+1);  // If present increase the value 
            }
            else{
                a.put(c,1);           // Or Start the count by 1
            }
        }

        // System.out.println(a);
        
        // for(Map.Entry<Character, Integer> entry: a.entrySet()){
        //     System.out.println(entry);
        // }

        for(Character k : a.keySet()){
            if(a.get(k)==1){
                System.out.println(k);
            }
        }
    }
}
