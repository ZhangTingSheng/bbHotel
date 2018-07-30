package bb.hotel.androidquick.demo.ui.activity;

import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseActivity;
import bb.hotel.androidquick.demo.ui.fragment.BaseRecyclerViewAdapterHelperFragment;
import bb.hotel.androidquick.demo.ui.fragment.CommonAdapterFragment;
import bb.hotel.androidquick.demo.ui.fragment.MultiViewTypeAdapterFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class AdapterActivity extends BaseActivity {

    @BindView(R.id.btn_adapter_common)
    Button mCommonAdapterButton;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_adapter;
    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @OnClick({R.id.btn_adapter_common, R.id.btn_adapter_multiviewtype, R.id.btn_adapter_brvah})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_adapter_common:
                readyGo(CommonAdapterFragment.class);
                break;
            case R.id.btn_adapter_multiviewtype:
                readyGo(MultiViewTypeAdapterFragment.class);
                break;
            case R.id.btn_adapter_brvah:
                readyGo(BaseRecyclerViewAdapterHelperFragment.class);
        }
    }
}
