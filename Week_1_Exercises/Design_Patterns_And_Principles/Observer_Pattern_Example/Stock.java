package Observer_Pattern_Example;

import java.util.ArrayList;
import java.util.List;

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
