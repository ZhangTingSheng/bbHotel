package bb.hotel.androidquick.demo.injector.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import bb.hotel.androidquick.demo.MyApplication;
import bb.hotel.androidquick.demo.injector.module.ApplicationModule;
import bb.hotel.androidquick.network.RetrofitManager;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Singleton
@Component(
        modules = {
                ApplicationModule.class
        }
)
public interface ApplicationComponent {
    Context getContext();  // 提供App的Context

    RetrofitManager getRetrofitManager();  //提供http的帮助类

    void inject(MyApplication application);
}
