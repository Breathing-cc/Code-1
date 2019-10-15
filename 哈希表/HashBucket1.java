class Person {
    String sn;

    Person(String sn) {
        this.sn = sn;
    }
}
public class HashBucket<K , V> {
    private static class Node<K,V>{
        private K key;
        private V value;
        private Node<K , V> next = null;
    }

    private Node<K , V>[]array = (Node<K , V>[])new Node[8];
    private int size;

    public V get(K key){
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K , V>head = array[index];
        for (Node<K , V>cur = head;cur != null;cur = cur.next) {
            if (key.equals(cur.key)) {
                return cur.value;
            }
        }
        return -1;
    }
}
