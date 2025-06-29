package com.example.repository;

import com.example.entity.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void testFindByName() {
        User user = new User();
        user.setId(11L);
        user.setName("CustomName");
        userRepository.save(user);

        List<User> results = userRepository.findByName("CustomName");

        assertFalse(results.isEmpty());
        assertEquals("CustomName", results.get(0).getName());
    }
}
