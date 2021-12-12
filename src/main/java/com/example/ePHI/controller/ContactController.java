package com.example.ePHI.controller;

import com.example.ePHI.model.Contact;
import com.example.ePHI.repositories.ContactRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient contact information.
 */
@Tag(name = "Contact")
@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Operation(summary = "Create contact")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Contact contact) {
        contactRepository.save(contact);
    }

    @Operation(summary = "Get contact")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Contact> getById(@RequestParam String id) {
        return contactRepository.findById(id);
    }

    @Operation(summary = "Get all contacts")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Operation(summary = "Update contact")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Contact contact) {
        contactRepository.update(contact);
    }
}
