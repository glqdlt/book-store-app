package com.glqdlt.bookstore.api.point.shop;

/**
 * Date 2019-10-26
 *
 * @author glqdlt
 */
public class CashPoint extends ShopPoint {
    private static final String CODE = getShopCode() + "02";

    @Override
    public String getPointCode() {
        return CODE;
    }
}
