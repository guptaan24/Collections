package collections.doublyLinkedList;

public class DoublyLinkedList<V> {
    Node head;
    DoublyLinkedList(){
        head=null;
    }

    public void addFirst(V value){
        if(head==null){
            head=new Node(value);
            return;
        }
        Node newNode=new Node(value);
        head.previous=newNode;
        newNode.next=head;
        head=newNode;
    }
}
