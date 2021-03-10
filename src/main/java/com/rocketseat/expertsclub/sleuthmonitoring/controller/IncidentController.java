package com.rocketseat.expertsclub.sleuthmonitoring.controller;


import com.rocketseat.expertsclub.sleuthmonitoring.model.Incident;
import com.rocketseat.expertsclub.sleuthmonitoring.repository.IncidentRepository;
import com.rocketseat.expertsclub.sleuthmonitoring.service.IncidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class IncidentController {

    private Logger log = LoggerFactory.getLogger((this.getClass()));

    @Autowired
    private IncidentRepository incidentRepository;

    @Autowired
    private IncidentService incidentService;

    @PostMapping("/incidents")
    public Incident createIncident(@Valid @RequestBody Incident incident) {
        log.info("Criando um incidente com o nome {} e a descricao {} ",
                incident.getName(), incident.getDescription());
        incidentService.processIncident();
        return  incidentRepository.save(incident);

    }

    @GetMapping("/incidents")
    public List<Incident> getAllIncidents() {
        log.info("Listando todos os incidentes cadastrados");
        return  incidentRepository.findAll();

    }

}
