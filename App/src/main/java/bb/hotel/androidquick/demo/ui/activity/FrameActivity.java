package bb.hotel.androidquick.demo.ui.activity;

import android.os.Bundle;

import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseTActivity;
import bb.hotel.androidquick.tool.LogUtil;
import bb.hotel.androidquick.tool.ReflectUtil;
import bb.hotel.androidquick.ui.base.QuickFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class FrameActivity extends BaseTActivity {

    protected static String TAG = "FrameActivity";
    private Bundle bundle;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_frame;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        bundle = extras;
    }

    @Override
    protected void initViewsAndEvents() {
        String className = bundle.getString("fragmentName");
        LogUtil.i(TAG, "the fragment class name is->" + className);
        if (className != null) {
            Object object = ReflectUtil.getObject(className);
            if (object instanceof QuickFragment) {
                QuickFragment fragment = (QuickFragment) object;
                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commitAllowingStateLoss();
                }
            } else {
                LogUtil.e(TAG, " the fragment class is not exist!!!");
            }
        }
    }

    @Override
    protected void initInjector() {

    }
}
