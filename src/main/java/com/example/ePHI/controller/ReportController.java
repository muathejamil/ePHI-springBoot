package com.example.ePHI.controller;

import com.example.ePHI.model.Report;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ePHI.repositories.ReportRepository;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient medical reports information.
 */
@Tag(name = "Medical report")
@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private final ReportRepository reportRepository;

    public ReportController(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }


    @Operation(summary = "Create medical report")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Report report) {
        reportRepository.save(report);
    }

    @Operation(summary = "Get medical report")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Report> getById(@RequestParam String id) {
        return reportRepository.findById(id);
    }

    @Operation(summary = "Get all medical reports")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    @Operation(summary = "Update medical report")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Report report) {
        reportRepository.update(report);
    }
}
