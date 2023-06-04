package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MarksBreakupDTO;
import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.MarksBreakup;

import java.util.List;

public interface MarksBreakupService {
    public MessageDTO addMarksBreakup(MarksBreakupDTO marksBreakupDTO);
    public List<MarksBreakup> showMarksBreakup();
}
