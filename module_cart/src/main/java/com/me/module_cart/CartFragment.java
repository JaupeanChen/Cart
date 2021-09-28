package com.me.module_cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.me.export_cart.CartRouteTable;

/**
 * Author: ChenGuiPing
 * Date: 2021/9/28
 * Description:
 */
@Route(path = CartRouteTable.PATH_CART_FRAGMENT_ROUTE)
public class CartFragment extends Fragment {

    public CartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_cart_fragment, container, false);
    }
}
