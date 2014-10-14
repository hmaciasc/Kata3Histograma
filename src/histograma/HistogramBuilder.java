package histograma;

public class HistogramBuilder <Type> {
    
    public Histogram<Type> build(Type[] types){
        Histogram<Type> histogram = new Histogram();
        for (Type type : types)
            histogram.put(type, histogram.get(type));
        return histogram;
    }
}
