package com.me.module_cart;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.me.export_cart.CartInfo;
import com.me.export_cart.CartRouteTable;
import com.me.export_cart.ICartService;

/**
 * Author: ChenGuiPing
 * Date: 2021/9/27
 * Description:
 */
@Route(path = CartRouteTable.PATH_CART_SERVICE)
public class CartServiceImpl implements ICartService {
    @Override
    public CartInfo getCartInfo() {
        CartInfo cartInfo = new CartInfo();
        cartInfo.setCount(666);
        return cartInfo;
    }

    @Override
    public void init(Context context) {
        //Aroute路由注入方法，可不做处理
    }
}
