package singleton;

/**
 * Created by Admin on 2019/12/30
 * 单例模式：有很多种，饿汉懒汉模式 枚举，静态内部实现
 * 饿汉模式
 */
 public class SingletonPattern {
    public static SingletonPattern session=new SingletonPattern();
    public static SingletonPattern getInstance(){

        return session;
    }
}
