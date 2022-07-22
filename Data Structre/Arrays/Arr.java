import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Arr { 

    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3,6,4};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // ArrayList<Integer> s = new ArrayList<Integer>();  //capacity
        // s.add(10);
        // s.add(20);
        // s.add(30);
        // s.addAll(1,arr);
        // System.out.println(s);

        // // Iterator i = s.iterator();
        // ListIterator i = s.listIterator(4);
        // System.out.println(i.next());
        // System.out.println(i.next());
        // System.out.println(i.next());
        // System.out.println(i.next());
        // // System.out.println(i.previous());
        // // System.out.println(i.previous());
        // // System.out.println(i.next());
    }
}


