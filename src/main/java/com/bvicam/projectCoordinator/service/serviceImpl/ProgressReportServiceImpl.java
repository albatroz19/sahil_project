package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.Presentation;
import com.bvicam.projectCoordinator.entity.ProgressReport;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.ProgressReportRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.ProgressReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressReportServiceImpl implements ProgressReportService {
    @Autowired
    ProgressReportRepository progressReportRepository;

    @Override
    public MessageDTO addProgressReport(ProgressReport progressReport){
        progressReportRepository.save(progressReport);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Progress Report is added.");
        return messageDTO;
    }

    @Override
    public List<ProgressReport> showProgressReport(){
        List<ProgressReport> progressReports = progressReportRepository.findAll();
        return progressReports;
    }
}
