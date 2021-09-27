package com.me.export_cart;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: ChenGuiPing
 * Date: 2021/9/27
 * Description: 封装工具类，供外部便捷调用
 */
public class CartServiceUtil {

    /**
     * 获取服务
     * @return ICartService
     */
    public static ICartService getCartService() {
        return (ICartService) ARouter.getInstance()
                .build(CartRouteTable.PATH_CART_SERVICE)
                .navigation();
    }

    /**
     * 获取购物车信息
     * @return CartInfo
     */
    public static CartInfo getCartInfo() {
        return getCartService().getCartInfo();
    }

    /**
     * 跳转到购物车页面
     * @param param1 参数1
     * @param param2 参数2
     * 参数根据实际需求定
     */
    public static void navigateToCart(String param1, String param2) {
        ARouter.getInstance()
                .build(CartRouteTable.PATH_CART_ROUTE)
                .withString("param1", param1)
                .withString("param2", param2)
                .navigation();
    }

}
