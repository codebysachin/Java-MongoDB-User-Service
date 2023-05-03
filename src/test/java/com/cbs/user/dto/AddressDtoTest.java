package com.cbs.user.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressDtoTest {
    private AddressDto addressDto;

    @BeforeEach
    void setUp() {
        addressDto = new AddressDto("123 Main St", "Apt 1", "London", "Greater London", "SW1A 1AA");
    }

    @Test
    void testGetLine1() {
        assertEquals("123 Main St", addressDto.getLine1());
    }

    @Test
    void testGetLine2() {
        assertEquals("Apt 1", addressDto.getLine2());
    }

    @Test
    void testGetTown() {
        assertEquals("London", addressDto.getTown());
    }

    @Test
    void testGetCounty() {
        assertEquals("Greater London", addressDto.getCounty());
    }

    @Test
    void testGetPostcode(){  assertEquals("SW1A 1AA", addressDto.getPostcode());}
}
