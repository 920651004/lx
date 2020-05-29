package adapter.objectadapter;

/**
 * Created by aser on 2020/5/28
 */
class WildChicken implements Chicken {
    @Override
    public void gobble() {
        System.out.print("野鸡叫zzzzz");
    }

    @Override
    public void fly() {
        System.out.print("野鸡也会飞");
    }
}
