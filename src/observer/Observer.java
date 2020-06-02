package observer;

/**
 * Created by aser on 2020/6/2
 */
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
