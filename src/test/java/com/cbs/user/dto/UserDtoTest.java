package com.cbs.user.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserDtoTest {
    private UserDto userDto;
    @Mock
    private ContactDto contactDto;
    @Mock
    private AddressDto addressDto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userDto = new UserDto("John", "Doe", contactDto, addressDto);
    }

    @Test
    void testGetFirstName() {
        assertEquals("John", userDto.getFirstName());
    }

    @Test
    void testGetLastName() {
        assertEquals("Doe", userDto.getLastName());
    }

    @Test
    void testGetContact() {
        assertEquals(contactDto, userDto.getContactDto());
    }

    @Test
    void testGetAddress() {
        assertEquals(addressDto, userDto.getAddressDto());
    }

    @Test
    void testGetFormattedAddress() {
        when(addressDto.getFormattedAddress()).thenReturn("Flat 1, 123 Main St, London, Greater London, SW1A 1AA");
        assertEquals("Flat 1, 123 Main St, London, Greater London, SW1A 1AA", userDto.getAddressDto().getFormattedAddress());
    }
}
