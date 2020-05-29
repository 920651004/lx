package adapter.objectadapter;

/**
 * Created by aser on 2020/5/28
 * 对象适配模式：其实就是把一个对象强转成另外一个对象但是具体实现方法还是由鸡来实现，本质上相当于狼披羊皮
 */
class ChickenToDuck {
    public static void main(String[] args){
    Chicken chicken=new WildChicken();
    //将一只野鸡适配成鸭子
    Duck duck=new ChickenAdapter(chicken);
    }
}
