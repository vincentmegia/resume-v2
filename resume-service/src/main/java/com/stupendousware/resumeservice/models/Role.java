package com.stupendousware.resumeservice.models;

import java.util.List;

public class Role {
    private String title;
    private List<String> responsibilities;

    public Role() {}
    public Role(String title, List<String> responsibilities) {
        this.title = title;
        this.responsibilities = responsibilities;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }
}
