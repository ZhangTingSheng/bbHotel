package bb.hotel.androidquick.demo.ui.fragment.architecture2;

import android.view.View;

import butterknife.OnClick;
import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseFragment;
import bb.hotel.androidquick.tool.ToastUtil;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class Architecture2Fragment extends BaseFragment implements IModuleCallback{
    private Module1 mModule1;
    private Module2 mModule2;
    @Override
    protected void initViewsAndEvents() {
        initModule();
    }

    private void initModule() {
        View search_root = getActivity().findViewById(R.id.module_root);
        mModule1 = new Module1(search_root, this);
        mModule2 = new Module2(search_root, this);
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_architecture2;
    }

    @OnClick({R.id.btn_module1, R.id.btn_module2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_module1:
                mModule1.hideView();
                break;
            case R.id.btn_module2:
                mModule2.modify("123");
                break;
        }
    }

    @Override
    public void doModify(String content) {
        ToastUtil.showToast("Modify Content is: " + content);
    }
}
