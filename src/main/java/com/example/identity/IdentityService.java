package com.example.identity;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IdentityService {
    private Map<String, User> users = new HashMap<>();

    public IdentityService() {
        users.put("12345678", new User("12345678", "Juan"));
        users.put("87654321", new User("87654321", "María"));
    }

    public boolean verifyCIExists(String ci) {
        return users.containsKey(ci);
    }
}
