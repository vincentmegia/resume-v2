package com.stupendousware.resumeservice.repositories;

import com.stupendousware.resumeservice.models.*;

import java.io.IOException;
import java.util.List;

public interface IResumeRepository {
    List<Title> getTitle() throws IOException;
    List<Work> getWorkHistory() throws IOException;
    List<Skill> getSkills() throws IOException;
    List<Summary> getSummary() throws IOException;
    List<Education> getEducations() throws IOException;
}
