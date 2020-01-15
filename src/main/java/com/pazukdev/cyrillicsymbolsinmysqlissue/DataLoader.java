package com.pazukdev.cyrillicsymbolsinmysqlissue;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Siarhei Sviarkaltsau
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    public static final String USER_NAME = "абв";

    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
        if (userRepository.findAll().isEmpty()) {
            createUser();
        }
    }

    private void createUser() {
        final User user = new User();
        user.setName(USER_NAME);
        userRepository.save(user);
    }

}
















