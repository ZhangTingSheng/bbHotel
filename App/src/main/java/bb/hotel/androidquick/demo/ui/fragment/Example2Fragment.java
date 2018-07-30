package bb.hotel.androidquick.demo.ui.fragment;

import bb.hotel.androidquick.demo.R;
import bb.hotel.androidquick.demo.base.BaseFFragment;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class Example2Fragment extends BaseFFragment {

    public static Example2Fragment newInstance() {
        return new Example2Fragment();
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_example2;
    }
}
