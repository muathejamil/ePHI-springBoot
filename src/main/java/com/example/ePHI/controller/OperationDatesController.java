package com.example.ePHI.controller;

import com.example.ePHI.model.OperationDates;
import com.example.ePHI.repositories.OperationDatesRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient operation dates.
 */
@Tag(name = "Operations dates")
@RestController
@RequestMapping("/OperationDates")
public class OperationDatesController {

    @Autowired
    private final OperationDatesRepository operationDatesRepository;

    public OperationDatesController(OperationDatesRepository operationDatesRepository) {
        this.operationDatesRepository = operationDatesRepository;
    }

    @Operation(summary = "Create operation date")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody OperationDates operationDates) {
        operationDatesRepository.save(operationDates);
    }

    @Operation(summary = "Get operation date")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<OperationDates> getById(@RequestParam String id) {
        return operationDatesRepository.findById(id);
    }

    @Operation(summary = "Get all operation date")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<OperationDates> getAll() {
        return operationDatesRepository.findAll();
    }

    @Operation(summary = "Update operation date")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody OperationDates operationDates) {
        operationDatesRepository.update(operationDates);
    }
}
