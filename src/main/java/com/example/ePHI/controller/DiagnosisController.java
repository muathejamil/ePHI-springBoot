package com.example.ePHI.controller;

import com.example.ePHI.model.Diagnosis;
import com.example.ePHI.repositories.DiagnosisRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient diagnosis information.
 */
@Tag(name = "Diagnosis")
@RestController
@RequestMapping("/Diagnosis")
public class DiagnosisController {

    @Autowired
    private final DiagnosisRepository diagnosisRepository;

    public DiagnosisController(DiagnosisRepository diagnosisRepository) {
        this.diagnosisRepository = diagnosisRepository;
    }

    @Operation(summary = "Create Diagnosis")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Diagnosis diagnosis) {
        diagnosisRepository.save(diagnosis);
    }

    @Operation(summary = "Get Diagnosis")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Diagnosis> getById(@RequestParam String id) {
        return diagnosisRepository.findById(id);
    }

    @Operation(summary = "Get All Diagnosis")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Diagnosis> getAll() {
        return diagnosisRepository.findAll();
    }

    @Operation(summary = "Update Diagnosis")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Diagnosis diagnosis) {
        diagnosisRepository.update(diagnosis);
    }
}
