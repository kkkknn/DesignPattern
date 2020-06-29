package ObserverMode;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println("hi"+name+"更新了，内容"+arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
