package com.me.module_cart;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.me.export_cart.CartRouteTable;
import com.me.module_common.BaseActivity;

@Route(path = CartRouteTable.PATH_CART_ROUTE)
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