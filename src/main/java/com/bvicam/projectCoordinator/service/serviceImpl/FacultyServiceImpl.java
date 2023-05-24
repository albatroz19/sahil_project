package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Faculty;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.FacultyRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public MessageDTO addFaculty(Faculty faculty){
        facultyRepository.save(faculty);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Project is added.");
        return messageDTO;
    }

    @Override
    public List<Faculty> showFaculty(){
        List<Faculty> faculties = facultyRepository.findAll();
        return faculties;
    }
}
