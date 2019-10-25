package com.glqdlt.bookstore.storeentity.pointbank;

import com.glqdlt.bookstore.api.point.PointBank;
import com.glqdlt.bookstore.storeentity.user.StoreUserEntity;

import javax.persistence.*;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
@Entity
@Table(name = "tb_point_bank")
public class PointBankEntity implements PointBank {
    private Long id;
    private StoreUserEntity user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    @JoinColumn
    public StoreUserEntity getUser() {
        return user;
    }

    public void setUser(StoreUserEntity user) {
        this.user = user;
    }

    private Long visitPoint;
    private Long shopPoint;
    private Long writePoint;

    public Long getVisitPoint() {
        return visitPoint;
    }

    public void setVisitPoint(Long visitPoint) {
        this.visitPoint = visitPoint;
    }

    public Long getShopPoint() {
        return shopPoint;
    }

    public void setShopPoint(Long shopPoint) {
        this.shopPoint = shopPoint;
    }

    public Long getWritePoint() {
        return writePoint;
    }

    public void setWritePoint(Long writePoint) {
        this.writePoint = writePoint;
    }

    @Override
    public Long getAllPointsSum() {
        return getWritePoint() + getShopPoint() + getVisitPoint();
    }
}
