package com.example.ePHI.controller;

import com.example.ePHI.model.AssessmentAndPlan;
import com.example.ePHI.repositories.AssessmentAndPlanRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * Rest controller for patient Assessment and Plan information.
 */
@Tag(name = "Assessment And Plan")
@RestController
@RequestMapping("/AssessmentAndPlan")
public class AssessmentAndPlanController {

    @Autowired
    private final AssessmentAndPlanRepository assessmentAndPlanRepository;


    public AssessmentAndPlanController(AssessmentAndPlanRepository assessmentAndPlanRepository) {
        this.assessmentAndPlanRepository = assessmentAndPlanRepository;
    }

    @Operation(summary = "Create oatient assessment and plan")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody AssessmentAndPlan assessmentAndPlan) {
        assessmentAndPlanRepository.save(assessmentAndPlan);
    }

    @Operation(summary = "Get assessment and plan")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<AssessmentAndPlan> getById(@RequestParam String id) {
        return assessmentAndPlanRepository.findById(id);
    }

    @Operation(summary = "Get All assessments and plans")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<AssessmentAndPlan> getAll() {
        return assessmentAndPlanRepository.findAll();
    }

    @Operation(summary = "Update assessment and plan")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody AssessmentAndPlan assessmentAndPlan) {
        assessmentAndPlanRepository.update(assessmentAndPlan);
    }
}
