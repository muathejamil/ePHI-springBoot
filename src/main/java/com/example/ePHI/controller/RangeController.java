package com.example.ePHI.controller;

import com.example.ePHI.model.Address;
import com.example.ePHI.model.Range;
import com.example.ePHI.repositories.RangeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient ranges information.
 */
@Tag(name = "Dates Range")
@RestController
@RequestMapping("/ranges")
public class RangeController {

    @Autowired
    private final RangeRepository rangeRepository;

    public RangeController(RangeRepository rangeRepository) {
        this.rangeRepository = rangeRepository;
    }

    @Operation(summary = "Create date range")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Range range) {
        rangeRepository.save(range);
    }

    @Operation(summary = "Get date range")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Range> getById(@RequestParam String id) {
        return rangeRepository.findById(id);
    }

    @Operation(summary = "Get all date ranges")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Range> getAll() {
        return rangeRepository.findAll();
    }

    @Operation(summary = "Create date range")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Range range) {
        rangeRepository.update(range);
    }
}
