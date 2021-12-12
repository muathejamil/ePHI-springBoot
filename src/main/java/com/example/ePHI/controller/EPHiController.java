package com.example.ePHI.controller;

import com.example.ePHI.model.EPHI;
import com.example.ePHI.repositories.EPHiRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for ephi  information.
 */
@Tag(name = "ePHI")
@RestController
@RequestMapping("/api/ephis")
public class EPHiController {

    @Autowired
    @Qualifier("EPHiRepository")
    private final EPHiRepository epHiRepository;

    public EPHiController(@Qualifier("EPHiRepository") EPHiRepository epHiRepository) {
        this.epHiRepository = epHiRepository;
    }

    @Operation(summary = "Create patient ePHI")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String create(@RequestBody EPHI ephi) {
        return epHiRepository.save(ephi).getId();
    }

    @Operation(summary = "Get patient ePHI")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<EPHI> getById(@PathVariable String id) {
        return epHiRepository.findById(id);
    }

    @Operation(summary = "Get all ePHIs")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<EPHI> getAll() {
        return epHiRepository.findAll();
    }

    @Operation(summary = "Update patient ePHI")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody EPHI ephi) {
        epHiRepository.update(ephi);
    }

    @Operation(summary = "Delete patient ePHI")
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        epHiRepository.deleteById(id);
    }
}
