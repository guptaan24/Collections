package binarySearchTree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        root=null;
    }

    public void insert(int value){
       root= insertNode(value,root);
    }

    public Node insertNode(int value, Node n){
        if(n==null){
            return new Node(value);
        }else if(value<n.getValue())
        {
             n.setLeft(insertNode(value,n.getLeft()));
        }else{
           n.setRight( insertNode(value,n.getRight()));
        }
        return n;
    }

    public int height(BinarySearchTree bst){
      return  nodeHeight(bst.root);
    }

    public int nodeHeight(Node n){
        if(n==null){
            return 0;
        }
        int leftHeight=nodeHeight(n.left);
        int rightHeight=nodeHeight(n.right);
        return Math.max(leftHeight,rightHeight) +1;
    }

    public void inorder(Node n){
        //Left Root Right
        if(n==null){
           return;
        }
        inorder(n.left);
        System.out.println(n.value);
        inorder(n.right);
    }

    public void preOrder(Node n){
        //root left right
        if(n==null){
            return;
        }
        System.out.println(n.value);
        preOrder(n.left);
        preOrder(n.right);
    }

    public void postOrder(Node n){
        //Left Roght Root
        if(n==null){
            return;
        }
        preOrder(n.left);
        preOrder(n.right);
        System.out.println(n.value);
    }

    public void breadthFirstSearch(Node n){

        int level =1;
        while (level(n,level)){
            level++;
        }

    }

    public boolean level(Node n,int level){
        if(n==null){
            return false;
        }
        if(level==1){
            System.out.println(n.value);
            return true;
        }
        boolean left=level(n.left,level-1);
        boolean right=level(n.right,level-1);
        return left||right;
    }



    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(4);
        bst.insert(9);
        bst.insert(8);
        bst.insert(1);
        bst.insert(3);
//        System.out.println(bst.height(bst));
        bst.breadthFirstSearch(bst.root);
    }

}
