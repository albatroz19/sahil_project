package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Presentation;
import com.bvicam.projectCoordinator.repository.PresentationRepository;
import com.bvicam.projectCoordinator.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PresentationServiceImpl implements PresentationService {
    @Autowired
    PresentationRepository presentationRepository;

    @Override
    public MessageDTO addPresentation(Presentation presentation){
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
