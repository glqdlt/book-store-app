package com.glqdlt.bookstore.storeentity.user;

import com.glqdlt.bookstore.api.user.AbstractUser;
import com.glqdlt.bookstore.storeentity.mail.EmailEntity;
import com.glqdlt.bookstore.storeentity.pointbank.PointBankEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
@Entity
@Table(name = "tb_user")
public class StoreUserEntity extends AbstractUser<EmailEntity, PointBankEntity> {

    private LocalDateTime regDate;
    private Boolean lock;
    private Long no;

    @Transient
    @Override
    public PointBankEntity getPoint() {
        return super.getPoint();
    }

    @Override
    public void setPoint(PointBankEntity point) {
        super.setPoint(point);
    }

    @Override
    public void setLevel(Integer level) {
        super.setLevel(level);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    @Column(name = "name")
    @Override
    public String getName() {
        return super.getName();
    }

    @Column(name = "user_id")
    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public List<EmailEntity> getEmails() {
        return super.getEmails();
    }

    @Override
    public void setEmails(List<EmailEntity> emails) {
        super.setEmails(emails);
    }

    @Override
    public Integer getLevel() {
        return super.getLevel();
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }
}
