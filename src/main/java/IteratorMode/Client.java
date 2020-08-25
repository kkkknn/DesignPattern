package IteratorMode;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate<String> a=new ConcreteAggregate<String>();
        a.add("Aige");
        a.add("Studio/n");
        a.add("SM");
        a.add(" Brother");
        Iterator iterator=a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
