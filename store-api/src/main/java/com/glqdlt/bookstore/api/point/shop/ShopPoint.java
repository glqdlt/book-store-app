package com.glqdlt.bookstore.api.point.shop;

import com.glqdlt.bookstore.api.point.AbstractPoint;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public abstract class ShopPoint extends AbstractPoint {
    private static final String SHOP_CODE = "PSA";

    static String getShopCode() {
        return SHOP_CODE;
    }

}
