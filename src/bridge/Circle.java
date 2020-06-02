package bridge;

/**
 * Created by aser on 2020/6/1
 */
class Circle extends Shape {
    private int redius;

    public Circle(DrawApi drawApi, int redius) {
        super(drawApi);
        this.redius = redius;
    }

    @Override
    public void draw() {
        drawApi.draw(redius,0,0);
    }
}
