package com.innovateXT.user.controller;

import com.innovateXT.user.dto.AddressDto;
import com.innovateXT.user.dto.ContactDto;
import com.innovateXT.user.dto.UserDto;
import com.innovateXT.user.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserControllerTest {
    @Mock
    private UserService userService;

    @Mock
    private AddressDto addressDto;

    @Mock
    private ContactDto contactDto;

    private UserController userController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        userController = new UserController(userService);
    }

    @Test
    public void getUserById_returnsUser() {
        // Setup mock user
        UserDto userDto = new UserDto("John", "Doe", contactDto, addressDto);
        when(userService.getUserById(1L)).thenReturn(userDto);

        // Call getUserById method directly
        ResponseEntity<UserDto> result = userController.getUserById(1L);

        // Verify that the userService.getUserById method was called once with the correct ID
        verify(userService, times(1)).getUserById(1L);

        // Verify that the returned User object has the correct properties
        assertEquals(userDto.getFirstName(), result.getBody().getFirstName());
        assertEquals(userDto.getLastName(), result.getBody().getLastName());
    }
}
