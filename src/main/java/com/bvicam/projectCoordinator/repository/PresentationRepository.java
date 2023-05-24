package com.bvicam.projectCoordinator.repository;

import com.bvicam.projectCoordinator.entity.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentationRepository extends JpaRepository<Presentation,Long> {
}
