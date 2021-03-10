package com.rocketseat.expertsclub.sleuthmonitoring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {
    private Logger log = LoggerFactory.getLogger((this.getClass()));


    public void processIncident(){
        log.info("recebendo a criacao do chamado");
        log.info("encaminhando seu chamado para o setor responsavel");
    }
}
