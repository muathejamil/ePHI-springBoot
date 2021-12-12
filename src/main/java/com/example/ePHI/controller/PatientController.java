package com.example.ePHI.controller;

import com.example.ePHI.model.Patient;
import com.example.ePHI.repositories.PatientRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient information.
 */
@Tag(name = "Patient")
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Operation(summary = "Create patient")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @Operation(summary = "Create patient")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Patient> getById(@RequestParam String id) {
        return patientRepository.findById(id);
    }

    @Operation(summary = "Create patient")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Operation(summary = "Create patient")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Patient patient) {
        patientRepository.update(patient);
    }
}

