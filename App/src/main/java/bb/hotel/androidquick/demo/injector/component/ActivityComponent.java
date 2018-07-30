package bb.hotel.androidquick.demo.injector.component;

import android.app.Activity;
import android.content.Context;

import dagger.Component;
import bb.hotel.androidquick.demo.injector.ActivityScope;
import bb.hotel.androidquick.demo.injector.module.ActivityModule;
import bb.hotel.androidquick.demo.ui.activity.NetworkActivity;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();
    Context getContext();

    void inject(NetworkActivity networkActivity);
}
