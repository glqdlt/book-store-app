package com.glqdlt.bookstore.api.bender;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public class SimpleBenderAuthority extends BenderAuthority {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
