package kata2;

import java.util.HashMap;

public class Histogram {
    public final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }
    
    public HashMap<Integer,Integer> getHistogram(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < vector.length; i++) {
            if(!hashMap.containsKey(vector[i])){
                hashMap.put(vector[i], 1);
            }else{
                hashMap.put(vector[i], hashMap.get(vector[i])+1);
            }
        }
        return hashMap;
    }
}
