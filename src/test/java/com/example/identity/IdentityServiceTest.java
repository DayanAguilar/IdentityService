package com.example.identity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IdentityServiceTest {

    private IdentityService identityService = new IdentityService();
    @Test
    @DisplayName("It should find a valid CI")
    void verifyCIExists() {
        assertEquals(true,identityService.verifyCIExists("12345678"));
    }
    @Test
    @DisplayName("It should not find a valid CI")
    void verifyCIDoesnotExists() {
        assertEquals(false,identityService.verifyCIExists("123456789"));
    }

}