package IteratorMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    public List<T> list=new ArrayList<T>();
    public void add(T obj) {
        list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
