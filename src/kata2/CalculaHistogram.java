package kata2;

public class CalculaHistogram {

    public static <T> Histogram<T> computeHisto(T[] vector){
        Histogram <T> histo= new Histogram<>();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
    
    
}
