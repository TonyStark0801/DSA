public class GasAndCost {

    public static void main(String[] args) {
        int[] gas   = {1,2,3,4,5};
        int[] cost  = {3,4,5,1,2};
        for(int i=0;i<gas.length;i++){
             if(canTraverse(gas, cost, i)){
                System.out.println("Start from : " +i+ " th Gas station");
                System.exit(1);
             }
        }

    }

    public static  boolean canTraverse(int[] gas, int[] cost, int start){
        int n = gas.length;
        int i = start;
        boolean started = false;
        int remaining =0;
        while (i!=start || !started ) {
            started = true;
            remaining += gas[i]-cost[i];
            if(remaining <0){
                return false;
            }
            i=(i+1)%n;
        }
        return true;
    }
}