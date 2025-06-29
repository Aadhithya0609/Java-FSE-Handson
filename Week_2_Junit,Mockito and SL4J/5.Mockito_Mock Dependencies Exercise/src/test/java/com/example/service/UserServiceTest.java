package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUserById() {
        User user = new User();
        user.setId(2L);
        user.setName("Alice");

        when(userRepository.findById(2L)).thenReturn(Optional.of(user));

        User result = userService.getUserById(2L);
        assertNotNull(result);
        assertEquals("Alice", result.getName());
    }
}
