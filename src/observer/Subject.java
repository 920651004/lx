package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aser on 2020/6/2
 */
class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notuifyAllObserver();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notuifyAllObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
