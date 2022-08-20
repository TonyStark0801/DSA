
public class Anagram {
    public static void main(String[] args) {
        String s1 = "qwertyuiopasdfghjklzxcvbnm";
        String s2 = "qwertyuiopasdfghjklzxcvbnm";

        // check(s1,s2);
        System.out.println(check(s1,s2));
    }

    public static boolean check(String s1 , String s2){
        int[] charArray = new int[26];

        if(s1.length()!=s2.length()){
            return false;
        }

        for(char x :s1.toCharArray()){
            charArray[(int)x-97]+=1;
        }
        for(char x :s2.toCharArray()){
            charArray[(int)x-97]-=1;
        }

        for(int x : charArray){
           if(x>0){
            return false;
           }
        }
        return true;

       

        // //O(n)
        // HashMap<Character,Integer> hash1 = new HashMap<>();
        // for(int i=0; i<s1.length(); i++){
        //     char c = s1.charAt(i);
        //     if(hash1.containsKey(c)){
        //         hash1.put(c,hash1.get(c)+1);
        //     }
        //     else{
        //         hash1.put(c,1);
                
        //     }
        // }
        
        // //O(n)
        // HashMap<Character,Integer> hash2 = new HashMap<>();
        // for(int i=0; i<s2.length(); i++){
        //     char c = s2.charAt(i);
        //     if(hash2.containsKey(c)){
        //         hash2.put(c,hash2.get(c)+1);
        //     }
        //     else{
        //         hash2.put(c,1);

        //     }
        // }
        // System.out.println(hash1);
        // System.out.println(hash2);

        // //O(n)
        
        // System.out.println(hash1.keySet());
        // for(char x : hash1.keySet()){
        //     System.out.println(!hash2.containsKey(x));
        //     if(!hash2.containsKey(x) || hash1.get(x)!=hash2.get(x) )
        //         return false;
        // }
        // return true;

    }
}
