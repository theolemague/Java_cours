import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class MultiMap<K,V> extends HashMap<K,List<V>> implements Map<K,List<V>>{

    /**
     * Add a value in the multimap at the key adress
     * @param key the key adress
     * @param value the value
     */
    public void  putOneValue(K key, V value){
        List<V> list;
        if(containsKey(key)){
            list = get(key);
        } else {
            list = new ArrayList<V>();
        }
        list.add(value);
        put(key, list);
    }
    
    /**
     * Check if a value is in the multimap
     * @param value the value
     * @return 'True' if the value is contained, 'False' else
     */
    public boolean containsOneValue(V value){
        for (Map.Entry<K, List<V>> e: entrySet()) {
            List<V> list = e.getValue();
            if (list.contains(value)) return true;
        }
        return false;
    }
}