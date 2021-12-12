package com.example.ePHI.controller;

import com.example.ePHI.model.FamilyMember;
import com.example.ePHI.repositories.FamilyMemberRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient family member information.
 */

@Tag(name = "Family patient member")
@RestController
@RequestMapping("/familyMembers")
public class FamilyMemberController {

    @Autowired
    private final FamilyMemberRepository familyMemberRepository;

    public FamilyMemberController(FamilyMemberRepository familyMemberRepository) {
        this.familyMemberRepository = familyMemberRepository;
    }

    @Operation(summary = "Create family member")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody FamilyMember familyMember) {
        familyMemberRepository.save(familyMember);
    }

    @Operation(summary = "Get family member")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<FamilyMember> getById(@RequestParam String id) {
        return familyMemberRepository.findById(id);
    }

    @Operation(summary = "Get all family members")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<FamilyMember> getAll() {
        return familyMemberRepository.findAll();
    }

    @Operation(summary = "Update family member")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public FamilyMember update(@RequestBody FamilyMember familyMember) {
        return familyMemberRepository.update(familyMember);
    }
}
