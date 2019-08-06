package collections.linkedList;

public class Node<V> {
    Node next;
    V value;

    public Node(V value) {
        this.value = value;
    }
    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
