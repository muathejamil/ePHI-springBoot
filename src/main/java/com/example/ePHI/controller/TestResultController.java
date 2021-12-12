package com.example.ePHI.controller;

import com.example.ePHI.model.Address;
import com.example.ePHI.model.TestResult;
import com.example.ePHI.repositories.TestResultRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient test results information.
 */
@Tag(name = "Test Result")
@RestController
@RequestMapping("/testResults")
public class TestResultController {

    @Autowired
    private final TestResultRepository testResultRepository;

    public TestResultController(TestResultRepository testResultRepository) {
        this.testResultRepository = testResultRepository;
    }

    @Operation(summary = "Create patient test result")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody TestResult testResult) {
        testResultRepository.save(testResult);
    }

    @Operation(summary = "Get patient test result")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<TestResult> getById(@RequestParam String id) {
        return testResultRepository.findById(id);
    }

    @Operation(summary = "Get all patient test result")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<TestResult> getAll() {
        return testResultRepository.findAll();
    }

    @Operation(summary = "Update patient test result")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody TestResult testResult) {
        testResultRepository.update(testResult);
    }
}
