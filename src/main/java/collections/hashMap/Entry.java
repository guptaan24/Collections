package collections.hashMap;

public class Entry<K ,V> {

    Entry next;
    K key;
    V value;

    Entry(K key, V value){
        this.next=null;
        this.key=key;
        this.value=value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
