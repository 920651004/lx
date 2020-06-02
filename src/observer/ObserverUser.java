package observer;

/**
 * Created by Duan on 2020/6/2
 */
class ObserverUser {

    public static void main(String[] args){
        Subject subject=new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);
        subject.setState(22);
    }
}
