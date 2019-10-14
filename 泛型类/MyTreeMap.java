import java.util.Map;

public class MyTreeMap <K,V> implements Map<K,V>{
    public V getOrDefault(Object key, V defaultValue) {
        return null;
    }

    private static  class Node<K,V> implements Map.Entry<K,V>{
        private K key;
        private V value;
    }
}
