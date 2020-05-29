package factory.abstractfactory;

/**
 * Created by Admin on 2019/12/30
 */
public class SoccerFactory implements BallAbstract {
    @Override
    public String create() {
        return "足球";
    }
}
