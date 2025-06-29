package com.example.service;

import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceExceptionTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    public UserServiceExceptionTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testUserNotFound() {
        when(userRepository.findById(100L)).thenReturn(Optional.empty());
        assertThrows(NoSuchElementException.class, () -> userService.getUserOrThrow(100L));
    }
}
