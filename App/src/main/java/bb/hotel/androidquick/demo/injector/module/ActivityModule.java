package bb.hotel.androidquick.demo.injector.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import bb.hotel.androidquick.demo.injector.ActivityScope;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {this.mActivity = activity;}

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
