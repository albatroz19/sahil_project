package com.bvicam.projectCoordinator.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private String projectName;
    private String projectDescription;
    private String startDate;
    private String endDate;
    private long facultyId;
}
