package bb.hotel.androidquick.demo.injector.component;

import android.app.Activity;

import dagger.Component;
import bb.hotel.androidquick.demo.injector.FragmentScope;
import bb.hotel.androidquick.demo.injector.module.FragmentModule;
import bb.hotel.androidquick.demo.ui.fragment.network1.Network1Fragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

    void inject(Network1Fragment network1Fragment);
}
