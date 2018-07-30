package bb.hotel.androidquick.demo.ui.fragment.network1;

import bb.hotel.androidquick.demo.base.BaseModel;
import bb.hotel.androidquick.demo.base.BasePresenter;
import bb.hotel.androidquick.demo.base.BaseView;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface Network1Contract {
    interface Model extends BaseModel {

    }

    interface View extends BaseView {
        void updateView(String result);
//        void refreshAppUpdateProgress(int progress);
        void downloadCompleted(String path);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void initData(String type);
    }
}
