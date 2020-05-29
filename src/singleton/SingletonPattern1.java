package singleton;

/**
 * Created by Admin on 2020/1/15
 * 单例模式：饱汉模式
 */
class SingletonPattern1 {
    private SingletonPattern1() {}
    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile SingletonPattern1 session=null;

    public static SingletonPattern1 getInstance(){
        if (session==null){
            synchronized (SingletonPattern1.class){
                if (session==null){
                    session=new SingletonPattern1();
                }
            }
        }
        return session;
    }
}
