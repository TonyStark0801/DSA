

public class GoingHome{
    
    public static void main(String args[]){
        int dest = 10;
        int src = 1;
        reachHome(src,dest);
    }
    static void reachHome(int src,int dest){
        if(src==dest){
            System.out.println("Reached");
            return;
        }
        System.out.println(src++);
        reachHome(src, dest);
    }
}