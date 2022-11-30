package com.stupendousware.resumeservice.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stupendousware.resumeservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class ResumeRepository implements IResumeRepository {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<Title> getTitle() throws IOException {
        List<Title> title = objectMapper.readValue(
                new ClassPathResource("title.json").getFile(),
                new TypeReference<>(){});
        return title;
    }

    @Override
    public List<Work> getWorkHistory() throws IOException {
        List<Work> workList = objectMapper.readValue(
                new ClassPathResource("work.json").getFile(),
                new TypeReference<>(){});
        return workList;
    }

    @Override
    public List<Skill> getSkills() throws IOException {
        List<Skill> skills = objectMapper.readValue(
                new ClassPathResource("skills.json").getFile(),
                new TypeReference<>(){});
        return skills;
    }

    @Override
    public List<Summary> getSummary() throws IOException {
        List<Summary> summary = objectMapper.readValue(
                new ClassPathResource("summary.json").getFile(),
                new TypeReference<>(){});
        return summary;
    }

    @Override
    public List<Education> getEducations() throws IOException {
        List<Education> educations = objectMapper.readValue(
                new ClassPathResource("education.json").getFile(),
                new TypeReference<>(){});
        return educations;
    }
}
