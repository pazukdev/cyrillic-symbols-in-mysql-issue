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

    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
        createUser();
    }

    private void createUser() {
        final User user = new User();
        user.setName("абв");
        userRepository.save(user);
    }

}
















