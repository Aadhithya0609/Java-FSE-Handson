package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    public UserControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUser() {
        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(userService.getUserById(1L)).thenReturn(user);

        ResponseEntity<User> response = userController.getUser(1L);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("John", response.getBody().getName());
    }
}
