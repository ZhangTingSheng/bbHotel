package bb.hotel.androidquick.demo.base;

import android.os.Bundle;

import javax.inject.Inject;

import bb.hotel.androidquick.demo.MyApplication;
import bb.hotel.androidquick.demo.injector.component.ActivityComponent;
import bb.hotel.androidquick.demo.injector.component.DaggerActivityComponent;
import bb.hotel.androidquick.demo.injector.module.ActivityModule;
import bb.hotel.androidquick.tool.LogUtil;

/**
 * @Description: 第二种类型的BaseActivity
 * @Detail: with: mvp, dagger2, rxjava, systembartint, permission
 * @Author: ddnosh
 * @Website http://blog.csdn.net/ddnosh
 */
public abstract class BaseTActivity<T extends BasePresenter> extends BaseActivity {

    protected static String TAG = "BaseTActivity";

    @Inject
    public T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogUtil.i(TAG, "onCreate:" + getClass().getSimpleName());
        //dagger2
        initInjector();
        if (this instanceof BaseView)
            mPresenter.initVM(this);//如果实现了BaseView这个接口的类，就将实例化过的View和Model传入
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.onDestroy();
            mPresenter = null;
        }
        super.onDestroy();
        LogUtil.i(TAG, "onDestroy:" + getClass().getSimpleName());
    }

    protected void initInjector() {

    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .applicationComponent(MyApplication.getInstance().getApplicationComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

}
