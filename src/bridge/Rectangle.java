package bridge;

/**
 * Created by aser on 2020/6/1
 */
class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(DrawApi drawApi, int x, int y) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.draw(0,x,y);
    }
}
