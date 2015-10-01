package kata2;

import java.util.HashMap;

public class Histogram<T> {
    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }
    
    public HashMap<T,Integer> getHistogram(){
        HashMap<T, Integer> hashMap = new HashMap<>();
        for (T key : vector) {
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, 1);
            } else {
                hashMap.put(key, hashMap.get(key) + 1);
            }
        }
        
        return hashMap;
    }
}
