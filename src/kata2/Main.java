package kata2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        
        Integer [] vector= {1,1,1,3,4,5,6,9,100,100,-4,-4};
        
        String[] vector1={"Juan", "Ana","Lucia", "Pedro", "Pepe","Juan", "Ana","Lucia", "Pedro","Lucia", "Pedro","Pedro","Pedro","Pedro"};
        
        //Histogram histo = new Histogram(vector);
        Histogram<Object> histogram =CalculaHistogram.computeHisto(vector);

        for (Object key:histogram.keySet()){
            System.out.println(key +" : "+histogram.get(key));
        }
    }
}
