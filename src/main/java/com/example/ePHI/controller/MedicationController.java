package com.example.ePHI.controller;

import com.example.ePHI.model.Medication;
import com.example.ePHI.repositories.MedicationRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient medication information.
 */
@Tag(name = "Medication")
@RestController
@RequestMapping("/medications")
public class MedicationController {
    @Autowired
    private final MedicationRepository medicationRepository;


    public MedicationController(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    @Operation(summary = "Create medication")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Medication medication) {
        medicationRepository.save(medication);
    }

    @Operation(summary = "Get medication")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Medication> getById(@RequestParam String id) {
        return medicationRepository.findById(id);
    }

    @Operation(summary = "Get all medications")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Medication> getAll() {
        return medicationRepository.findAll();
    }

    @Operation(summary = "Update medication")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Medication medication) {
        medicationRepository.update(medication);
    }
}
