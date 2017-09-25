package com.wuhenzhizao.view;

import com.gomeos.mvvm.view.LayoutManagers;

import java.util.List;

/**
 * Created by wuhenzhizao on 2017/9/21.
 */

public interface DataBindingInterface {

    void setItemViewFactory(String className);

    void setLayoutManager(LayoutManagers.LayoutManagerFactory factory);

    void setItems(List items);
}
