package com.glqdlt.bookstore.api.user;

import com.glqdlt.bookstore.api.email.Email;
import com.glqdlt.bookstore.api.point.PointBank;

import java.util.List;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public interface User<E extends Email, PB extends PointBank> {
    String getName();

    String getId();

    List<E> getEmails();

    Integer getLevel();

    PB getPoint();
}
