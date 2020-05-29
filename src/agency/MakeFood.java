package agency;

import sun.rmi.runtime.Log;
/**
 *@author aser
 *@time 2020/5/28  15:16
 *@describe:代理模式相当于工厂流水线，内部已经设定好程序，直接执行就可以获取结果（本质上是做方法包装和方法增强）
 */
/**
 * Created by aser on 2020/5/28
 */
class MakeFood {
    public static void main(String[] args){
    FoodService foodService=new FoodServiceProxy();
    foodService.makeChicken();
    Food food=foodService.makeChicken();
    System.out.print(food.getCondiment());
    }
}
