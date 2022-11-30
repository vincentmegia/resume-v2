package com.stupendousware.resumeservice.models;

public class Skill {
    private String name;
    private int expertise;

    public Skill(String name, int expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public int getExpertise() {
        return expertise;
    }

    public int getUnknown() {
        return 100 - expertise;
    }
}
