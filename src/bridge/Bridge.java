package bridge;

/**
 * Created by aser on 2020/6/1
 * 桥梁模式：总结一下就是为甲乙双方提供通道，桥梁模式扩展性很强
 */
class Bridge {
    public static void main(String[] args){
        Shape redCircle=new Circle(new RedPen(),10);
        Shape blueRectangle=new Rectangle(new BulePen(),8,4);
        redCircle.draw();
        blueRectangle.draw();
    }
}
