package yuncar.aten.com.newshare.animal;

/**
 * project:NewShare
 * package:yuncar.aten.com.newshare.animal
 * Created by 佘少雄 on 2018/8/2.
 * e-mail : 610184089@qq.com
 */

public class Points {
   public float x;
    public float y;

    public Points(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
