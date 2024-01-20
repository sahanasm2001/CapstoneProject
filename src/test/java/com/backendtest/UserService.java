package com.backendtest;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> userDatabase;

    public UserService() {
        // Simulate an in-memory user database (username, password)
        userDatabase = new HashMap<>();
    }

    public boolean registerUser(String username, String password) {
        // Simulate user registration by adding the user to the in-memory database
        if (userDatabase.containsKey(username)) {
            return false; // Registration failed, username already exists
        }

        userDatabase.put(username, password);
        return true; // Registration successful
    }

    public boolean validateCredentials(String username, String password) {
        // Simulate credential validation by checking against the in-memory database
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
