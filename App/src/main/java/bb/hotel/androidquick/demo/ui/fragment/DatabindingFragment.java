package bb.hotel.androidquick.demo.ui.fragment;

import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseVFragment;
import bb.hotel.androidquick.demo.databinding.FragmentDatabindingBinding;
import bb.hotel.androidquick.tool.ToastUtil;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class DatabindingFragment extends BaseVFragment<FragmentDatabindingBinding> {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_databinding;
    }

    @Override
    protected void initViewsAndEvents() {
        getBinding().setAct(this);
        getBinding().tvDatabindingEmpty.setText("this is a databinding view");
    }

    public void onConfirmClick() {
        ToastUtil.showToast("clicked");
    }
}
