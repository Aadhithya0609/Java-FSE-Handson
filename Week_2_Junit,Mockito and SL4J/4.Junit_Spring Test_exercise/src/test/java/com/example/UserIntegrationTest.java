package com.example;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class UserIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    UserRepository userRepository;

    @Test
    void testGetUserIntegration() throws Exception {
        User user = new User();
        user.setId(99L);
        user.setName("IntegrationUser");
        userRepository.save(user);

        mockMvc.perform(get("/users/99"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("IntegrationUser"));
    }
}
