
public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if(index >= nodes.length-1 || nodes[index] == -1 ){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    
    //no. of nodes
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = count(root.left);
        int rightNodes = count(root.right);
        return leftNodes+rightNodes+1;
    }

    //sum of tree
    public static int sum(Node root){
        if(root == null){ 
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum= sum(root.right);
        return leftSum+rightSum+root.data;
    }
    
    //height of tree
    public static int height(Node root){
        if(root == null){ 
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)+1;
        return myHeight;
    }

    //Diameter of tree , NUmber of nodes in the longest path between any 2 nodes
      

    public static void main(String[] args) {
        int[] nodes = {3,9,20,-1,-1,15,7};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(height(root));
    }
}
