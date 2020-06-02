package observer;

/**
 * Created by aser on 2020/6/2
 */
class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.print("订阅数据发生变化，新数据为"+subject.getState());
    }
}
