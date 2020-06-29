package ObserverMode;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
