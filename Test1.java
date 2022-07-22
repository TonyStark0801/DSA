import java.util.ArrayList;
import java.util.Hashtable;

import javax.lang.model.element.Element;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,7,5,1,2};
        Hashtable<Integer,Boolean> hash = new Hashtable<>();
        for(int x : nums){
            if(!hash.containsKey(x)){
                hash.put(x,false);
            }
            else{
                hash.put(x, true);
            }
                
        }
        
        System.out.println(hash);
        
    }
}
