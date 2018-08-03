package yuncar.aten.com.newshare.animal;

import android.animation.TypeEvaluator;

/**
 * project:NewShare
 * package:yuncar.aten.com.newshare.animal
 * Created by 佘少雄 on 2018/8/2.
 * e-mail : 610184089@qq.com
 */

public class TestTypeEvaluator implements TypeEvaluator<Points> {

    private float x;
    private float y;

    @Override
    public Points evaluate(float fraction, Points startValue, Points endValue) {
        if(startValue!=null){
            x = endValue.getX()-startValue.getX();
            y = endValue.getY()-startValue.getY();
          float ly=  startValue.getY()+y*fraction;
            y = (float)Math.sin(ly*Math.PI/180)*80+ly;
            x = startValue.getX()+x*fraction;
        }
        return new Points(x,y);
    }
}
