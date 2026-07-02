package org.karthikeyan.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private final UserRegistration user = new UserRegistration();

    @Test
    public void validInputs(){
        assertTrue(user.validateSignup("Ram", "abcd@1234", "ram@gmail.com"));
    }

    @Test
    public void testUsername(){
        assertFalse(user.validateSignup(" ", "abcd@1234", "ram@gmail.com"));
    }

    @Test
    public void testPassword(){
        assertFalse(user.validateSignup("Ram", "abcd@1", "ram@gmail.com"));
    }

    @Test
    public void testEmail(){
        assertFalse(user.validateSignup("Ram", "abcd@1234", "ramgmail.com"));
    }

}
