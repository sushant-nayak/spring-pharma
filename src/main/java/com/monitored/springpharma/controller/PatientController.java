package com.monitored.springpharma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.monitored.springpharma.dao.PatientDao;
import com.monitored.springpharma.model.Patient;


@RestController
@RequestMapping("/")
public class PatientController {
    @Autowired
    private PatientDao dao;

    @PostMapping("/patient")
    public String savePatientDataJson(@RequestBody Patient patient){

        return savePatientRecord(patient);
    }

    @PostMapping(value = "/datapoint", consumes = MediaType.APPLICATION_XML_VALUE)
    public String savePatientDataXml(@RequestBody(required = false) Patient patient){

        return savePatientRecord(patient);
    }

    @GetMapping("/patientRecords")
    public Iterable<Patient> getPatientData(){

        return dao.findAll();
    }

    private String savePatientRecord(Patient patient) {
        if(patient == null){
            return "Please provide a valid patient data.";
        }

        if(dao.save(patient) instanceof Patient){
            return "Record saved Successfully";
        }

        return "Record saved Unsuccessfully";
    }
}