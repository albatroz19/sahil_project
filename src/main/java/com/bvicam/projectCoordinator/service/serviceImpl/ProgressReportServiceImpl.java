package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.dto.ProgressReportDTO;
import com.bvicam.projectCoordinator.entity.Presentation;
import com.bvicam.projectCoordinator.entity.ProgressReport;
import com.bvicam.projectCoordinator.entity.Project;
import com.bvicam.projectCoordinator.repository.ProgressReportRepository;
import com.bvicam.projectCoordinator.repository.ProjectRepository;
import com.bvicam.projectCoordinator.service.ProgressReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProgressReportServiceImpl implements ProgressReportService {
    @Autowired
    ProgressReportRepository progressReportRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public MessageDTO addProgressReport(ProgressReportDTO progressReportDTO){
        ProgressReport progressReport = new ProgressReport();
        progressReport.setReportingDate(progressReportDTO.getReportingDate());
        Project project = projectRepository.findById(progressReportDTO.getProjectId()).orElse(null);
        if(Objects.isNull(project)){
            return new MessageDTO("Project not exist");
        }
        progressReport.setProject(project);
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
