package bb.hotel.androidquick.demo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

import bb.hotel.androidquick.demo.db.DBManager;
import bb.hotel.androidquick.demo.injector.component.ApplicationComponent;
import bb.hotel.androidquick.demo.injector.component.DaggerApplicationComponent;
import bb.hotel.androidquick.demo.injector.module.ApplicationModule;
import bb.hotel.androidquick.network.RetrofitManager;
import bb.hotel.androidquick.tool.SpUtil;
import bb.hotel.androidquick.tool.ToastUtil;
import spa.lyh.cn.statusbarlightmode.ImmersionConfiguration;
import spa.lyh.cn.statusbarlightmode.ImmersionMode;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class MyApplication extends Application {

    private static MyApplication INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        //获取全局变量Application
        if (INSTANCE == null) {
            INSTANCE = this;
        }
        //初始化ToastUtil
        ToastUtil.register(this);
        //初始化SpUtil
        SpUtil.init(this);
        //初始化greendao
        DBManager.getInstance().init(getApplicationContext());
        //初始化url
        RetrofitManager.initBaseUrl("http://gank.io/api/");
        //沉浸式标题栏
        ImmersionConfiguration configuration = new ImmersionConfiguration.Builder(this)
                .enableImmersionMode(ImmersionConfiguration.ENABLE)
                .setColor(R.color.base_bg)//默认标题栏颜色
                .build();
        ImmersionMode.getInstance().init(configuration);
        //初始化AndroidUtilCode
        Utils.init(this);
    }

    public static synchronized MyApplication getInstance() {
        return INSTANCE;
    }

    //dagger2:get ApplicationComponent
    public static ApplicationComponent getApplicationComponent() {
        return DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(INSTANCE)).build();
    }

}
