package bb.hotel.androidquick.demo.ui.activity;

import android.view.View;

import butterknife.OnClick;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseActivity;
import bb.hotel.androidquick.demo.ui.fragment.CommonToolBarFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class ToolbarActivity extends BaseActivity {
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_toolbar;
    }

    @Override
    protected void initViewsAndEvents() {
        getToolbar().setTitle(getString(R.string.app_name));
        getToolbar().setTitleTextColor(getResources().getColor(R.color.white));
    }

    @OnClick({R.id.btn_ui_commontoolbar})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ui_commontoolbar:
                readyGo(CommonToolBarFragment.class);
                break;
        }
    }

    @Override
    protected boolean isLoadDefaultTitleBar() {
        return true;
    }
}
