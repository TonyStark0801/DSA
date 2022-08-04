

package Arrays;

public class NthFebonacci {
    
    public static void main(String args[]){
        // System.out.println("Enter the number:");
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int N = 30;
        
        System.out.println(febonacci(N));
    }

    static int febonacci(int N){
        int fib=0;    int a=0;    int b=1;
        
        if(N==1){
            // return 0;
            return a;
        }
        if(N==2){
            // return 1;
            return b;
        }

        for(int i=3;i<=N;i++){
            fib=a+b;
            a=b;
            b=fib;
        }
        return fib;
        // return febonacci(N-1)+febonacci(N-2);
    }
}
