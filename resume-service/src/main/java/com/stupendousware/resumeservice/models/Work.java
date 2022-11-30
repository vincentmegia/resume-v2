package com.stupendousware.resumeservice.models;

import java.util.List;

public class Work {
    private String company;
    private List<Project> projects;
    private String yearStart;
    private String yearEnd;

    public Work() {}

    public String getCompany() {
        return company;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public String getYearStart() {
        return yearStart;
    }

    public String getYearEnd() {
        return yearEnd;
    }
}
