package com.bvicam.projectCoordinator.repository;

import com.bvicam.projectCoordinator.entity.ProgressReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressReportRepository extends JpaRepository<ProgressReport,Long> {
}
