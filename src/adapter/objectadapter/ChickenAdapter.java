package adapter.objectadapter;

/**
 * Created by aser on 2020/5/28
 */
class ChickenAdapter implements Duck {
    Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void quack() {
        chicken.gobble();
    }

    @Override
    public void fly() {
        chicken.fly();
    }
}
