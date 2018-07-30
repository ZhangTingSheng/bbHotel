package bb.hotel.androidquick.demo.ui.activity;

import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseActivity;
import bb.hotel.androidquick.demo.ui.fragment.TabFTLFragment;
import bb.hotel.androidquick.demo.ui.fragment.TabSTLFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TabActivity extends BaseActivity {

    @BindView(R.id.btn_tab_smartablayout)
    Button mButton1;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_tab;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @OnClick({R.id.btn_tab_smartablayout, R.id.btn_tab_flycoablayout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tab_smartablayout:
                readyGo(TabSTLFragment.class);
                break;
            case R.id.btn_tab_flycoablayout:
                readyGo(TabFTLFragment.class);
                break;
        }
    }
}
