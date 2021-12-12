package com.example.ePHI.controller;

import com.example.ePHI.model.Habits;
import com.example.ePHI.repositories.HabitsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient habits information.
 */
@Tag(name = "Patient Habits")
@RestController
@RequestMapping("/habits")
public class HabitsController {

    @Autowired
    private final HabitsRepository habitsRepository;

    public HabitsController(HabitsRepository habitsRepository) {
        this.habitsRepository = habitsRepository;
    }

    @Operation(summary = "Create habit")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Habits habits) {
        habitsRepository.save(habits);
    }

    @Operation(summary = "Get habit")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Habits> getById(@RequestParam String id) {
        return habitsRepository.findById(id);
    }

    @Operation(summary = "Get all habits")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Habits> getAll() {
        return habitsRepository.findAll();
    }

    @Operation(summary = "Update habit")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Habits habits) {
        habitsRepository.update(habits);
    }
}
