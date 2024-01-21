package com.backendtest;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> userDatabase;

    public UserService() {
        userDatabase = new HashMap<>();
    }

    public boolean registerUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            return false; 
        }

        userDatabase.put(username, password);
        return true; 
    }

    public boolean validateCredentials(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
