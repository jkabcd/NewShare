package yuncar.aten.com.newshare;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import yuncar.aten.com.newshare.animal.Points;
import yuncar.aten.com.newshare.animal.TestTypeEvaluator;

/**
 * project:NewShare
 * package:yuncar.aten.com.newshare
 * Created by 佘少雄 on 2018/8/1.
 * e-mail : 610184089@qq.com
 */

public class ToobarActivity extends AppCompatActivity {

    private Button btn_ss;
    private ObjectAnimator objectAnimator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toobar);
        setSupportActionBar((Toolbar) findViewById(R.id.tools));
        btn_ss = (Button) findViewById(R.id.btn_ss);
        ArrayList<Points> pointses = new ArrayList<Points>();
        pointses.add(new Points(0,0));
        pointses.add(new Points(600,300));
        objectAnimator = ObjectAnimator.ofObject(this,"sssd",new TestTypeEvaluator(),pointses.toArray());
        objectAnimator.setDuration(3000);
        btn_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objectAnimator.start();
            }
        });

//     ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setDisplayHomeAsUpEnabled(true);
        //或者getSupportActionBar().hide();
    }
    public void setSssd(Points x){
        btn_ss.setTranslationX(x.getX());
        btn_ss.setTranslationY(x.getY());
    }
}
