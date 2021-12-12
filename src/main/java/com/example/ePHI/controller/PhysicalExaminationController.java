package com.example.ePHI.controller;

import com.example.ePHI.model.Address;
import com.example.ePHI.model.PhysicalExamination;
import com.example.ePHI.repositories.PhysicalExaminationRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient physical examination information.
 */
@Tag(name = "Physical examination")
@RestController
@RequestMapping("/PhysicalExamination")
public class PhysicalExaminationController {

    @Autowired
    private final PhysicalExaminationRepository physicalExaminationRepository;

    public PhysicalExaminationController(PhysicalExaminationRepository physicalExaminationRepository) {
        this.physicalExaminationRepository = physicalExaminationRepository;
    }

    @Operation(summary = "Create physical examination")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody PhysicalExamination physicalExamination) {
        physicalExaminationRepository.save(physicalExamination);
    }

    @Operation(summary = "Get physical examination")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<PhysicalExamination> getById(@RequestParam String id) {
        return physicalExaminationRepository.findById(id);
    }

    @Operation(summary = "Get all physical examination")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<PhysicalExamination> getAll() {
        return physicalExaminationRepository.findAll();
    }

    @Operation(summary = "Update physical examination")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody PhysicalExamination physicalExamination) {
        physicalExaminationRepository.update(physicalExamination);
    }
}
