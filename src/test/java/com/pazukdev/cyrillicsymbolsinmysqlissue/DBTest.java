package com.pazukdev.cyrillicsymbolsinmysqlissue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Siarhei Sviarkaltsau
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DBTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void checkUserName() {
        final String expectedName = DataLoader.USER_NAME;
        final User user = userRepository.getOne(1L);
        Assert.assertEquals(expectedName, user.getName());
    }

}
