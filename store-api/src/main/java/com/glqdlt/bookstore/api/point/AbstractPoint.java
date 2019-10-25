package com.glqdlt.bookstore.api.point;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public abstract class AbstractPoint implements Point {
    private Long point;

    @Override
    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }
}
