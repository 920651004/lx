package factory.normalfactory;

import factory.simplefactory.Clothes;

/**
 * Created by Admin on 2019/12/30
 * 工厂模式：基本上和简单工厂模式类似，但是需要做更细致的拆分 比如说工厂可以根据需求生产不同的产品
 */
public interface BallFactory  {
    public Clothes create();
}
