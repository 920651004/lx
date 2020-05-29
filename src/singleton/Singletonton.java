package singleton;

/**
 * Created by Admin on 2020/1/15
 * 单例嵌套类
 */
class Singletonton {
    public static class Holder{
        public static Singletonton singletonton=new Singletonton();
    }
    public static Singletonton getInstance(){
        return Holder.singletonton;
    }
}
