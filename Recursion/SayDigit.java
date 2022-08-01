import java.util.Arrays;

public class SayDigit {
    static String[] a ={" Zero ", " One "," Two "," Three "," Four "," Five ",
                        " Six "," Seven "," Eight "," Nine "};
    public static void main(String args[]){
        int n = 15123;
        digit(n);
        // System.out.println(Arrays.toString(a));
    }
    static void digit(int n){
        if(n==0){
            return;
        }
        int d=n%10;
        digit(n/10);
        System.out.print(a[d]);

    }
}
