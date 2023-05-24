package com.bvicam.projectCoordinator.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String projectName;
    private String projectDescription;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    private Faculty faculty;
    @OneToMany(mappedBy = "project")
    private List<ProgressReport> progressReports;
    @OneToMany(mappedBy = "project")
    private List<Presentation> presentations;
    @OneToMany(mappedBy = "project")
    private List<MarksBreakup> marksBreakups;
}
