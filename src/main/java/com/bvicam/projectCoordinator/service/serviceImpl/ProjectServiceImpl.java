package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public MessageDTO addProject(Project project){
        projectRepository.save(project);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Project is added.");
        return messageDTO;
    }

    @Override
    public List<Project> showProject(){
        List<Project> projects = projectRepository.findAll();
        return projects;
    }

}
