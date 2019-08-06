package collections.doublyLinkedList;

public class Node<V> {
    Node next;
    Node previous;
    V value;

    Node(V value){
        this.value=value;
        previous=null;
        next=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
