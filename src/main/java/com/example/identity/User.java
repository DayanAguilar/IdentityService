package com.example.identity;

public class User {
    private String ci;
    private String name;

    public User(String ci, String name) {
        this.ci = ci;
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
