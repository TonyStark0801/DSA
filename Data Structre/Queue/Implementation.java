/* Implementation of Queue using Array DataStructure */

public class Implementation{
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        /*Front is by default in case of array*/
        
        //constructor
        Queue(int size){
            arr=new int[size];
            this.size=size;
        }

        //Check if empty
        public static boolean isEmpty(){
            return rear ==-1;
        }

        //Enque
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Full Queue!");
                return;
            }
            else{
                rear++;
                arr[rear]=data;
            }
        }

        //Dequeue -  Using int return type so that we can get the removed element
        //Dequeue is done from front - FIFO
        public static int  remove(){
            if(isEmpty()){
                System.out.println("Empty Queue!");
                return -1;
            }
            else{
                    int front = arr[0];
                    for (int i = 0; i < rear; i++) {
                        arr[i]=arr[i+1];
                    }
                    rear--;
                    return front;
            }
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue!");
                return -1;
            }
            return arr[0];
        }

    }
    
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}