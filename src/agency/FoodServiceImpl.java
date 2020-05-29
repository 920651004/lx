package agency;

/**
 * Created by aser on 2020/5/27
 */
class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {
        Food food=new Chicken();
        food.setChicken("1kg" );
        food.setSalt("3g");
        food.setSpicy("1g");

        return food;
    }

    @Override
    public Food makeNoodle() {
        Food f=new Noodle();
        f.setSalt("2g");
        f.setNoodle("2斤");
        return f;
    }
}
