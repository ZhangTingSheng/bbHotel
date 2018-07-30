package bb.hotel.androidquick.demo.ui.fragment;

import butterknife.BindView;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseFragment;
import bb.hotel.androidquick.ui.view.CommonToolBar;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class CommonToolBarFragment extends BaseFragment {
    @BindView(R.id.common_tool_bar)
    CommonToolBar mCommonToolBar;

    @Override
    protected void initViewsAndEvents() {
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_commontoolbar;
    }
}
