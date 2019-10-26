package com.glqdlt.bookstore.api.point.shop;

/**
 * Date 2019-10-26
 *
 * @author glqdlt
 */
public class BuyPoint extends ShopPoint {
    private static final String CODE = getShopCode() + "01";

    @Override
    public String getPointCode() {
        return CODE;
    }
}
