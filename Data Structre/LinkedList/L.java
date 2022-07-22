import java.util.*;


public class L{
       public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);

        System.out.println(arr);
        LinkedList<Integer> linked = new LinkedList<>(Arrays.asList(10,20,30,40));
        // LinkedList<Integer> link = new LinkedList<>();
        linked.add(1);
        linked.addAll(0,arr);
        // link = linked.clone();
        System.out.println(linked.size());


    }
}

































            // //create a LinkedList object and initialize it with Array elements converted to list
            // LinkedList<Integer> intList = new LinkedList<>(Arrays.asList(10,20,30,40,50));

            // //print the LinkedList just created
            // System.out.println("Contents of first LinkedList: " + intList);
         
            // //create an empty list
            // LinkedList&lt;String&gt; colorsList = new LinkedList&lt;&gt;();
            
            // //add elements to the linkedList using add method.
            // colorsList.add("Red");
            // colorsList.add("Green");
            // colorsList.add("Blue");
            // colorsList.add("Cyan");
            // colorsList.add("Magenta");

            // // print the LinkedList