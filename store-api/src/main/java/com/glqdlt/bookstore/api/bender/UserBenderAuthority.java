package com.glqdlt.bookstore.api.bender;

import com.glqdlt.bookstore.api.user.User;

import java.util.List;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public class UserBenderAuthority {
    private User user;
    private List<BenderAuthority> benderAuthorities;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BenderAuthority> getBenderAuthorities() {
        return benderAuthorities;
    }

    public void setBenderAuthorities(List<BenderAuthority> benderAuthorities) {
        this.benderAuthorities = benderAuthorities;
    }
}
