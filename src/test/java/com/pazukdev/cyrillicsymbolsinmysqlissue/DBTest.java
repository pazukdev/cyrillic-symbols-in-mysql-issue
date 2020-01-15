package com.pazukdev.cyrillicsymbolsinmysqlissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Siarhei Sviarkaltsau
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DBTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void checkUserName() {
        final User user = userRepository.getOne(1L);
        assertThat(user.getName()).isEqualTo(DataLoader.USER_NAME);
    }

}
