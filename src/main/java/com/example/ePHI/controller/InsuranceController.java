package com.example.ePHI.controller;

import com.example.ePHI.model.Insurance;
import com.example.ePHI.repositories.InsuranceRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient insurance information.
 */
@Tag(name = "Patient insurance")
@RestController
@RequestMapping("/Insurance")
public class InsuranceController {


    @Autowired
    private final InsuranceRepository insuranceRepository;

    public InsuranceController(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    @Operation(summary = "Create Insurance")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Insurance insurance) {
        insuranceRepository.save(insurance);
    }

    @Operation(summary = "Get Insurance")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Insurance> getById(@RequestParam String id) {
        return insuranceRepository.findById(id);
    }

    @Operation(summary = "Get All Insurances")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Insurance> getAll() {
        return insuranceRepository.findAll();
    }

    @Operation(summary = "Update insurance")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Insurance insurance) {
        insuranceRepository.update(insurance);
    }

}
