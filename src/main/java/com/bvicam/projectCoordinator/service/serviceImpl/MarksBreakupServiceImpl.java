package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MarksBreakupDTO;
import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.MarksBreakup;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.MarksBreakupRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.MarksBreakupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MarksBreakupServiceImpl implements MarksBreakupService {
    @Autowired
    MarksBreakupRepository marksBreakupRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public MessageDTO addMarksBreakup(MarksBreakupDTO marksBreakupDTO){
        MarksBreakup marksBreakup = new MarksBreakup();
        marksBreakup.setMarksCriteria(marksBreakupDTO.getMarksCriteria());
        marksBreakup.setMarksAllocated(marksBreakupDTO.getMarksAllocated());
        Project project = projectRepository.findById(marksBreakupDTO.getProjectId()).orElse(null);
        if(Objects.isNull(project)){
            return new MessageDTO("Project not exist");
        }
        marksBreakup.setProject(project);
        marksBreakupRepository.save(marksBreakup);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Marks are added.");
        return messageDTO;
    }

    @Override
    public List<MarksBreakup> showMarksBreakup(){
        List<MarksBreakup> marksBreakups = marksBreakupRepository.findAll();
        return marksBreakups;
    }
}
