package com.bvicam.projectCoordinator.service;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.ProgressReportDTO;
import com.bvicam.projectCoordinator.entity.Presentation;
import com.bvicam.projectCoordinator.entity.ProgressReport;

import java.util.List;

public interface ProgressReportService {
    public MessageDTO addProgressReport(ProgressReportDTO ProgressReportDTO);
    public List<ProgressReport> showProgressReport();
}
