package com.me.export_cart;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Author: ChenGuiPing
 * Date: 2021/9/27
 * Description: 对外暴露的服务，由module_cart来实现
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车信息
     */
    CartInfo getCartInfo();

}
