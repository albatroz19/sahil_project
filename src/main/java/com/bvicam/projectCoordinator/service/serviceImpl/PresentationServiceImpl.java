package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.PresentationDTO;
import com.bvicam.projectCoordinator.entity.Presentation;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.PresentationRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class PresentationServiceImpl implements PresentationService {
    @Autowired
    PresentationRepository presentationRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public MessageDTO addPresentation(PresentationDTO presentationDTO){
        Presentation presentation = new Presentation();
        presentation.setPresentationDate(presentationDTO.getPresentationDate());
        Project project = projectRepository.findById(presentationDTO.getProjectId()).orElse(null);
        if(Objects.isNull(project)){
            return new MessageDTO("Project not exist");
        }
        presentation.setProject(project);
        presentationRepository.save(presentation);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Presentation is added.");
        return messageDTO;
    }

    @Override
    public List<Presentation> showPresentation(){
        List<Presentation> presentations = presentationRepository.findAll();
        return presentations;
    }

}
