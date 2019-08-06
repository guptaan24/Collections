package collections.hashMap;

public class HashMap<K,V> {

    Entry<K,V>[] buckets=new Entry[16];

    public V get(K key){

        int hashCode=key.hashCode();
        Entry e=buckets[hashCode];
        if(e==null){
            return null;
        }
        while(e.getKey()!=key){
            e=e.next;
        }
        return (V)e.getValue();
    }

    public void put(K key, V value){

        int hashCode=key.hashCode();
        Entry e=buckets[hashCode];
        if(e==null){
            buckets[hashCode]=new Entry<K, V>(key,value);
            return;
        }
        while(e.next!=null){
            if(e.next.getKey()==key){
                e.next.setValue(value);
            }
            e=e.next;
        }

        if(e.getKey()==key){
            e.setValue(value);
        }else{
            e.next=new Entry<K, V>(key,value);
        }




    }

}
