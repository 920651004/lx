package factory.abstractfactory;

import factory.simplefactory.Shoe;

/**
 * Created by Admin on 2019/12/30
 */
class AbstractSoccerFactory implements BallAbstract {

    @Override
    public String create() {
        return new Shoe().Todosomething();
    }
    public BallAbstract anAbstract(){
        return new SoccerFactory();
    }
}
