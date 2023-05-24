package com.bvicam.projectCoordinator.repository;

import com.bvicam.projectCoordinator.entity.MarksBreakup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksBreakupRepository extends JpaRepository<MarksBreakup,Long> {
}
