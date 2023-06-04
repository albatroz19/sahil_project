package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.PresentationDTO;
import com.bvicam.projectCoordinator.entity.Presentation;

import java.util.List;

public interface PresentationService {
    public MessageDTO addPresentation(PresentationDTO presentationDTO);
    public List<Presentation> showPresentation();
}
