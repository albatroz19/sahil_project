package com.bvicam.projectCoordinator.controller;


import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.*;
import com.bvicam.projectCoordinator.service.serviceImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectCoordinatorController {
    @Autowired
    ProjectServiceImpl projectService;
    @Autowired
    FacultyServiceImpl facultyService;
    @Autowired
    MarksBreakupServiceImpl marksBreakupService;
    @Autowired
    PresentationServiceImpl presentationService;
    @Autowired
    ProgressReportServiceImpl progressReportService;

    @PostMapping("/v1/add/project")
    public ResponseEntity<MessageDTO> addProject(@RequestBody Project project){
        MessageDTO addProject = projectService.addProject(project);
        return new ResponseEntity<>(addProject, HttpStatus.OK);
    }

    @GetMapping("/v1/show/projects")
    public ResponseEntity<List<Project>> showProject(){
        List<Project> showProjects = projectService.showProject();
        return new ResponseEntity<>(showProjects, HttpStatus.OK);
    }

    @PostMapping("/v1/add/faculty")
    public ResponseEntity<MessageDTO> addFaculty(@RequestBody Faculty faculty){
        MessageDTO addFaculty = facultyService.addFaculty(faculty);
        return new ResponseEntity<>(addFaculty, HttpStatus.OK);
    }

    @GetMapping("/v1/show/faculty")
    public ResponseEntity<List<Faculty>> showFaculty(){
        List<Faculty> showFaculties = facultyService.showFaculty();
        return new ResponseEntity<>(showFaculties, HttpStatus.OK);
    }

    @PostMapping("/v1/add/marks")
    public ResponseEntity<MessageDTO> addMarksBreakup(@RequestBody MarksBreakup marksBreakup){
        MessageDTO addMarksBreakup = marksBreakupService.addMarksBreakup(marksBreakup);
        return new ResponseEntity<>(addMarksBreakup, HttpStatus.OK);
    }

    @GetMapping("/v1/show/marks")
    public ResponseEntity<List<MarksBreakup>> showMarksBreakup(){
        List<MarksBreakup> showMarksBreakup = marksBreakupService.showMarksBreakup();
        return new ResponseEntity<>(showMarksBreakup, HttpStatus.OK);
    }

    @PostMapping("/v1/add/presentation")
    public ResponseEntity<MessageDTO> addPresentation(@RequestBody Presentation presentation){
        MessageDTO addPresentation = presentationService.addPresentation(presentation);
        return new ResponseEntity<>(addPresentation, HttpStatus.OK);
    }

    @GetMapping("/v1/show/presentation")
    public ResponseEntity<List<Presentation>> showPresentation(){
        List<Presentation> showPresentation = presentationService.showPresentation();
        return new ResponseEntity<>(showPresentation, HttpStatus.OK);
    }

    @PostMapping("/v1/add/progress/report")
    public ResponseEntity<MessageDTO> addProgressReport(@RequestBody ProgressReport progressReport){
        MessageDTO addProgressReport = progressReportService.addProgressReport(progressReport);
        return new ResponseEntity<>(addProgressReport, HttpStatus.OK);
    }

    @GetMapping("/v1/show/progress/report")
    public ResponseEntity<List<ProgressReport>> showProgressReport(){
        List<ProgressReport> showProgressReport = progressReportService.showProgressReport();
        return new ResponseEntity<>(showProgressReport, HttpStatus.OK);
    }
}
