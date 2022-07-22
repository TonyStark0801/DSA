import java.util.Arrays;

/* 
 * ToDo : Sort the Array of size N with elemt 0s,1s,2s
 * Author : Shubham Mihsra
 * Use three counters 
 * Time Complexity ->  O(n)
 * Space Complexity -> O(1)
*/
public class sortArray0s1s2s {
    public static void main(String[] args) {
        int[] arr= {2,2,1,2,0};
        int zero,one,two;
        zero=one=two=0;
        for (int i : arr) {
            if(i==0) zero++;
            else if(i==1) one++;
            else two++;
        }
        int i=0;
        while(zero!=0) {
            arr[i]=0;
            zero--;
            i++;
        }
        while(one!=0){
            arr[i]=1;
            one--;
            i++;
        }
        while(two!=0){
            arr[i]=2;
            two--;
            i++;
        }

        System.out.println(Integer.MIN_VALUE);
        
    }

    
}



