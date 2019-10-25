package com.glqdlt.bookstore.storeentity.pointbank;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Date 2019-10-25
 *
 * @author glqdlt
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class PointBankTest {
    @Autowired
    private TestEntityManager testEntityManager;


    @Test
    void name() {

        Assert.assertNotNull(testEntityManager);

    }
}
