package com.example.ePHI.controller;

import com.example.ePHI.model.Visit;
import com.example.ePHI.repositories.VisitRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient visits information.
 */
@Tag(name = "Patient Visit")
@RestController
@RequestMapping("/visits")
public class VisitController {

    @Autowired
    private final VisitRepository visitRepository;


    public VisitController(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Operation(summary = "Create patient visit")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Visit visit) {
        visitRepository.save(visit);
    }

    @Operation(summary = "Get patient visit")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Visit> getById(@RequestParam String id) {
        return visitRepository.findById(id);
    }

    @Operation(summary = "Get all patient visits")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Visit> getAll() {
        return visitRepository.findAll();
    }

    @Operation(summary = "Update patient visit")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Visit address) {
        visitRepository.update(address);
    }
}
