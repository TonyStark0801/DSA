public class LastWordLen {
    public static void main(String[] args) {
        String s= "Hello planet earth, you are a great planet.  ";
        s = s.trim();
        String su = s.substring(s.lastIndexOf(" ")+1);
        System.out.println(su.length()); 
    }
}
