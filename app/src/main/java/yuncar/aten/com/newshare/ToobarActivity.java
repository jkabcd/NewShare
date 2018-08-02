package yuncar.aten.com.newshare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * project:NewShare
 * package:yuncar.aten.com.newshare
 * Created by 佘少雄 on 2018/8/1.
 * e-mail : 610184089@qq.com
 */

public class ToobarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toobar);
        setSupportActionBar((Toolbar) findViewById(R.id.tools));
//     ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setDisplayHomeAsUpEnabled(true);
        //或者getSupportActionBar().hide();
    }
}
