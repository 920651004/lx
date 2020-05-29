package factory.normalfactory;

import factory.simplefactory.Clothes;
import factory.simplefactory.Shoe;

/**
 * Created by Admin on 2019/12/30
 */
public class HoseFactory implements BallFactory{
    @Override
    public Clothes create() {
        return new Shoe();
    }
}
