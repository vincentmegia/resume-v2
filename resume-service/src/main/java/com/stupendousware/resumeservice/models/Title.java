package com.stupendousware.resumeservice.models;

public class Title {
    private String name;
    private String description;
    private String email;

    public Title(String name, String description, String email) {
        this.name = name;
        this.description = description;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }
}
