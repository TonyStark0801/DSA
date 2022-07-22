public class LL{
    private int size;
    LL(int size){
        size=this.size;
    }
    LL(){

    }
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    
    public void addFirst(String data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
            
        }
        currNode.next =newNode;
        
    }
    
    public void deleteFirst(){
        
        if (head==null) {
            System.out.println("EMPTY LIST: Nothing to delete ");
            return;
        }
        
        head=head.next;
        size--;
        

    }

    public void deleteLast(){
        
        if (head==null) {
            System.out.println("EMPTY LIST: Nothing to delete ");
            return;
        }
        size--;
        if(head.next==null){
            head =null;
            return;
        }

        Node secondLast = head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode= lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next=null;
        

    }

    public void printList(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }

        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    

    public static void main(String[] args) {
        LL linked = new LL();
        linked.addFirst("My");
        linked.addLast("Shubham");
        // linked.printList();
        linked.addLast("Mishra");
        // linked.printList();
        // linked.deleteLast();
        // linked.deleteFirst();
        // linked.printList()
        System.out.println(linked.size);
        // System.out.println(linked);




    }
}