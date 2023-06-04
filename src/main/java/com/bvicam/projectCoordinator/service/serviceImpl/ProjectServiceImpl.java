package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.ProjectDTO;
import com.bvicam.projectCoordinator.entity.Faculty;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.FacultyRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public MessageDTO addProject(ProjectDTO projectDTO){
        Project project = new Project();
        project.setProjectName(projectDTO.getProjectName());
        project.setProjectDescription(projectDTO.getProjectDescription());
        project.setStartDate(projectDTO.getStartDate());
        project.setEndDate(projectDTO.getEndDate());
        Faculty faculty =  facultyRepository.findById(projectDTO.getFacultyId()).orElse(null);
        if(Objects.isNull(faculty)){
            return new MessageDTO("Faculty not exist");
        }
        project.setFaculty(faculty);
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
