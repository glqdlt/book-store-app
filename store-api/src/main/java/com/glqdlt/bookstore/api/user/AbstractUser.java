package com.glqdlt.bookstore.api.user;

import com.glqdlt.bookstore.api.email.Email;
import com.glqdlt.bookstore.api.point.PointBank;

import java.util.List;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public abstract class AbstractUser<E extends Email, P extends PointBank> implements User<E, P> {
    private String name;
    private String id;
    private Integer level;
    private P point;

    @Override
    public P getPoint() {
        return point;
    }

    public void setPoint(P point) {
        this.point = point;
    }

    public void setEmails(List<E> emails) {
        this.emails = emails;
    }

    private List<E> emails;

    @Override
    public List<E> getEmails() {
        return emails;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Integer getLevel() {
        return level;
    }

}
