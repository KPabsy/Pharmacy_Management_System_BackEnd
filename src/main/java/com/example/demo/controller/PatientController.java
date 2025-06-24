package com.example.demo.controller;


import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {


    @Autowired
    private PatientService service;

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{patientId}")
    public Optional<Patient> getPatient(@PathVariable Integer patientId) {
        return service.getPatientById(patientId);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    @DeleteMapping("/{patientId}")
    public void deletePatient(@PathVariable Integer patientId) {
        service.deletePatient(patientId);
    }
}
