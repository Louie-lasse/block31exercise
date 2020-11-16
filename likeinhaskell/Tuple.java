package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple<T,R> {
    private final T first;
    private final R second;
    public Tuple(T t, R r){
        first = t;
        second = r;
    }
    public T fst(){return first;}
    public R snd(){return second;}
}
