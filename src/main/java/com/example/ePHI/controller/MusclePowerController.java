package com.example.ePHI.controller;

import com.example.ePHI.model.MusclePower;
import com.example.ePHI.repositories.MusclePowerRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient muscle power information.
 */
@Tag(name = "Muscle power")
@RestController
@RequestMapping("/musclePower")
public class MusclePowerController {

    @Autowired
    private final MusclePowerRepository musclePowerRepository;

    public MusclePowerController(MusclePowerRepository musclePowerRepository) {
        this.musclePowerRepository = musclePowerRepository;
    }

    @Operation(summary = "Create muscle power")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody MusclePower musclePower) {
        musclePowerRepository.save(musclePower);
    }

    @Operation(summary = "Get muscle power")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<MusclePower> getById(@RequestParam String id) {
        return musclePowerRepository.findById(id);
    }

    @Operation(summary = "Get all muscle power")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<MusclePower> getAll() {
        return musclePowerRepository.findAll();
    }

    @Operation(summary = "Update muscle power")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody MusclePower musclePower) {
        musclePowerRepository.update(musclePower);
    }
}
