package com.stupendousware.resumeservice.models;

import java.util.List;

public class Project {
    private String title;
    private String description;
    private List<Role> roles;
    private String technologies;
    private Boolean isOpen;

    public Project() {}

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public String getTechnologies() {
        return technologies;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}
