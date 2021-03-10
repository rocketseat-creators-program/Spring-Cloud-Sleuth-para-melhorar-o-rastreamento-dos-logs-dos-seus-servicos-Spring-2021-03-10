package com.rocketseat.expertsclub.sleuthmonitoring.repository;

import com.rocketseat.expertsclub.sleuthmonitoring.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
}
