package IteratorMode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list=new ArrayList<T>();
    private int cursor=0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }


    public boolean hasNext() {
        return cursor!=list.size();
    }

    public T next() {
        T obj=null;
        if(this.hasNext()){
            obj=this.list.get(cursor++);
        }
        return obj;
    }

    public void remove() {
    }

}
