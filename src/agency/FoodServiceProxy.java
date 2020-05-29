package agency;

/**
 * Created by aser on 2020/5/27
 */
class FoodServiceProxy implements FoodService {

    private FoodServiceImpl foodService=new FoodServiceImpl();
    @Override
    public Food makeChicken() {
        System.out.print("开始制作鸡腿");
        Food food=foodService.makeChicken();
        System.out.print("制作完成");
        food.AddCondiment("222");
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.print("开始制作面条");
        Food food=foodService.makeNoodle();
        return food;
    }
}
