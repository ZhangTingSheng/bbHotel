package bb.hotel.androidquick.demo.ui.fragment;

import android.os.Bundle;

import butterknife.BindView;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseFragment;
import bb.hotel.androidquick.ui.view.CommonToolBar;
import us.feras.mdv.MarkdownView;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class CodeFragment extends BaseFragment {
    @BindView(R.id.common_tool_bar)
    CommonToolBar mCommonToolBar;
    @BindView(R.id.mv_code)
    MarkdownView mMvCode;

    private Bundle mBundle;

    @Override
    protected void initViewsAndEvents() {
        mBundle = getActivity().getIntent().getExtras();
        mCommonToolBar.setTitle(mBundle.getString("title"));
        mMvCode.loadMarkdownFile("file:///android_asset/HttpRequestCallbackString.md", "file:///android_asset/css-themes/classic.css");
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_code;
    }
}
