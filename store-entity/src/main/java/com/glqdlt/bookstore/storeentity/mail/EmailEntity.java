package com.glqdlt.bookstore.storeentity.mail;

import com.glqdlt.bookstore.api.email.Email;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
@Entity
@Table(name = "tb_email")
public class EmailEntity implements Email {
    private Long id;
    private String address;
    private LocalDateTime regDate;

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getMailAddress() {
        return null;
    }
}
