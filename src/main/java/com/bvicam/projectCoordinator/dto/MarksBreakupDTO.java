package com.bvicam.projectCoordinator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarksBreakupDTO {
    private String marksCriteria;
    private long marksAllocated;
    private long projectId;
}
