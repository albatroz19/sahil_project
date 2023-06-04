package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.ProjectDTO;
import com.bvicam.projectCoordinator.entity.Project;

import java.util.List;

public interface ProjectService {
    public MessageDTO addProject(ProjectDTO projectDTO);
    public List<Project> showProject();
}
