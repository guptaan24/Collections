package collections.linkedList;

public class LinkedList<V> {

    Node node;

    public LinkedList() {
        this.node = null;
    }

    public void add(V value){
        if(node==null){
            node=new Node(value);
            return;
        }
        node=add(node,value);
    }

    public Node add(Node node, V value){

            if(node.next==null){
                node.next=new Node(value);
                return node;
            }
            add(node.next,value);

        return node;
    }


}
