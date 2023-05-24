package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Faculty;

import java.util.List;

public interface FacultyService {
    public MessageDTO addFaculty(Faculty faculty);
    public List<Faculty> showFaculty();
}
