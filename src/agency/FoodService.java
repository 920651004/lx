package agency;

/**
 * Created by aser on 2020/5/27
 * 代理模式：其实就是隐藏具体实现的类细节通常用于真实的实现前后添加一部分逻辑
 */
interface FoodService {
    Food makeChicken();
    Food makeNoodle();
}
