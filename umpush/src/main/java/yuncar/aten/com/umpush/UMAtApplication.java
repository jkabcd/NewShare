package yuncar.aten.com.umpush;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.PlatformConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * project:NewShare
 * package:yuncar.aten.com.newshare
 * Created by 佘少雄 on 2018/7/30.
 * e-mail : 610184089@qq.com
 *
 * <activity
 android:name=".wxapi.WXEntryActivity"
 android:configChanges="keyboardHidden|orientation|screenSize"
 android:exported="true"
 android:theme="@android:style/Theme.Translucent.NoTitleBar" />
 */

public class UMAtApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initUMPUSH();
        initUmengShared();
    }
    private void initUMPUSH(){//友盟推送
        PushAgent mPushAgent = PushAgent.getInstance(this);
//        mPushAgent.setDisplayNotificationNumber(0);
        UMConfigure.init(this,"5b5ea900f43e483ca10002f8","default_channel", UMConfigure.DEVICE_TYPE_PHONE, "1ba999f37b5dace2fb8b3ba24f1589eb");
//        UMConfigure.setLogEnabled(true);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {
            @Override
            public void onSuccess(String deviceToken) {
                Log.i("token","获取token成功"+deviceToken);
                //注册成功会返回device token
            }
            @Override
            public void onFailure(String s, String s1) {
                Log.i("token","获取token失败"+s+"---------"+s1);
            }
        });
        UmengNotificationClickHandler umengMessageHandler = new UmengNotificationClickHandler(){
            @Override
            public void dealWithCustomAction(Context context, UMessage uMessage) {
            }
        };
        mPushAgent.setNotificationClickHandler(umengMessageHandler);

    }
    public static  <T>List<T> ddd(T t){
        ArrayList<T> ss = new ArrayList<>();
        ss.add(t);
        return ss;
    }
    /**
     * 初始化 友盟分享
     */
    private void initUmengShared() {
        UMConfigure.init(this,"5a12384aa40fa3551f0001d1","umeng",UMConfigure.DEVICE_TYPE_PHONE,"");
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

        PlatformConfig.setWeixin("wx215bb4304a0f3305", "5f8f0873f787bdd1e7f5b3de5e57e23b");
        PlatformConfig.setSinaWeibo("2170570290", "b644d00071e738afc45e4caa0ad963ce","http://sns.whalecloud.com");
//        PlatformConfig.setQQZone("1106576170", "FeYJM96L754LOuyc");
        PlatformConfig.setQQZone("1106750895", "JYsQDXS55VLEJinP");
    }
}
