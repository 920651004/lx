package bridge;

/**
 * Created by aser on 2020/6/1
 */
class RedPen implements DrawApi{
    @Override
    public void draw(int redius, int x, int y) {
        System.out.print("用红色的笔画图 redius"+redius+",x"+x+",y"+y);
    }
}
