package bridge;

/**
 * Created by aser on 2020/6/1
 * 定义一个抽象类，具体实现使用DrawApi
 */
abstract class Shape {
   protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
