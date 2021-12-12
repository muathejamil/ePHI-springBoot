package com.example.ePHI.controller;

import com.example.ePHI.model.MedicalHistory;
import com.example.ePHI.repositories.MedicalHistoryRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient medical history information.
 */
@Tag(name = "Patient medical history")
@RestController
@RequestMapping("/medicalHistory")
public class MedicalHistoryController {

    @Autowired
    private final MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistoryController(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    @Operation(summary = "Create medical history")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody MedicalHistory medicalHistory) {
        medicalHistoryRepository.save(medicalHistory);
    }

    @Operation(summary = "Get medical history")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<MedicalHistory> getById(@RequestParam String id) {
        return medicalHistoryRepository.findById(id);
    }

    @Operation(summary = "Get all medical histories")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<MedicalHistory> getAll() {
        return medicalHistoryRepository.findAll();
    }

    @Operation(summary = "Update medical history")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody MedicalHistory medicalHistory) {
        medicalHistoryRepository.update(medicalHistory);
    }
}
