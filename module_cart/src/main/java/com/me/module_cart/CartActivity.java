package com.me.module_cart;

import com.me.module_common.BaseActivity;

public class CartActivity extends BaseActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_cart;
    }

    @Override
    public boolean isNeedToolBar() {
        return true;
    }

    @Override
    public void initData() {
        setToolbarTitle("购物车");
    }
}