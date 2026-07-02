package org.karthikeyan.methods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    private final PasswordValidation validator = new PasswordValidation();

    @Test
    public void validatePassword(){
        assertTrue(validator.validatePassword("SecurePass123!"));
    }

    @Test
    public void testPasswordTooShort(){
        assertFalse(validator.validatePassword("Pas1!"));
    }

    @Test
    public void testMissingUppercase(){
        assertFalse(validator.validatePassword("abcd1234!"));
    }

    @Test
    public void testMissingSpecialChar(){
        assertFalse(validator.validatePassword("ABcd12345"));
    }

    @Test
    public void testNullInput(){
        assertFalse(validator.validatePassword(null));
    }

}