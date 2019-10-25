package com.glqdlt.bookstore.api.scope;

import com.glqdlt.bookstore.api.user.User;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
public abstract class AbstractUserAccessScope<T extends Scope> {
    public abstract User getUser();

    public abstract T[] getScopes();
}
