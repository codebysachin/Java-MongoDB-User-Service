package com.cbs.user.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactDtoTest {

    private ContactDto contactDto;

    @BeforeEach
    void setUp() {
        contactDto = new ContactDto("jane@example.com", "1234567890");
    }

    @Test
    void testGetEmail() {
        assertEquals("jane@example.com", contactDto.getEmail());
    }

    @Test
    void testGetPhone() {
        assertEquals("1234567890", contactDto.getPhone());
    }
}

