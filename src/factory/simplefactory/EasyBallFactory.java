package factory.simplefactory;

/**
 * Created by Admin on 2019/12/30
 */
public class EasyBallFactory  {
    public static Clothes todo(String name){

        if (name.equals("clothes")){
            return new Hose();
        }else if (name.equals("shoe")){
            return new Shoe();
        }

        return null;
    }

    public static void main(String[] args) {
        Clothes clothes =EasyBallFactory.todo("clothes");
        Clothes shoe=EasyBallFactory.todo("shoe");
        System.out.println(clothes.Todosomething());
        System.out.println(shoe.Todosomething());
    }
}
