package com.stupendousware.resumeservice.controllers;

import com.stupendousware.resumeservice.models.*;
import com.stupendousware.resumeservice.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("resume")
public class ResumeController {
    @Autowired
    private ResumeRepository resumeRepository;

    @GetMapping("workhistory")
    public List<Work> getWorkHistory() throws IOException {
        return this.resumeRepository.getWorkHistory();
    }

    @GetMapping("title")
    public List<Title> getTitle() throws IOException {
        return this.resumeRepository.getTitle();
    }

    @GetMapping("skills")
    public List<Skill> getSkills() throws IOException {
        return this.resumeRepository.getSkills();
    }

    @GetMapping("summary")
    public List<Summary> getSummary() throws IOException {
        return this.resumeRepository.getSummary();
    }

    @GetMapping("educations")
    public List<Education> getEducations() throws IOException {
        return this.resumeRepository.getEducations();
    }
}
