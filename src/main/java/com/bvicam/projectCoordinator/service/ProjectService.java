package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Project;

import java.util.List;

public interface ProjectService {
    public MessageDTO addProject(Project project);
    public List<Project> showProject();
}
