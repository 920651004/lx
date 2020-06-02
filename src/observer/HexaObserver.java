package observer;

/**
 * Created by aser on 2020/6/2
 */
class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.print("订阅数据发生变化，新十六进制数据为"+subject.getState());
    }
}
