package com.backendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void testRegisterUser_Success() {
        System.out.println("Starting testRegisterUser_Success");

        boolean result = userService.registerUser("testuser", "password");

        System.out.println("Result: " + result);
        Assert.assertTrue(result, "User registration should be successful");
    }

    @Test
    public void testRegisterUser_Failure_UsernameExists() {
        // Register a user first
        userService.registerUser("admin@admin.com", "pwd");

        // Try to register the same username again
        boolean result = userService.registerUser("admin@admin.com", "pwd1");
        Assert.assertFalse(result, "User registration should fail as the username already exists");
    }

    @Test
    public void testValidateCredentials_Success() {
        // Register a user first
        userService.registerUser("admin@admin.com", "pwd");

        // Validate credentials for the registered user
        boolean result = userService.validateCredentials("admin@admin.com", "pwd");
        Assert.assertTrue(result, "Credential validation should be successful");
    }

    @Test
    public void testValidateCredentials_Failure_WrongPassword() {
        // Register a user first
        userService.registerUser("admin@admin.com", "pwd");

        // Validate credentials with the wrong password
        boolean result = userService.validateCredentials("admin@admin.com", "123");
        Assert.assertFalse(result, "Credential validation should fail with the wrong password");
    }
}
