package com.example.ePHI.controller;

import com.example.ePHI.model.Address;
import com.example.ePHI.repositories.AddressRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest controller for patient address information.
 */
@Tag(name = "Address")
@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private final AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Operation(summary = "Create Patient Address")
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(@RequestBody Address address) {
        addressRepository.save(address);
    }

    @Operation(summary = "Get Patient Address")
    @RequestMapping(path = "/getById/{id}", method = RequestMethod.GET)
    public Optional<Address> getById(@RequestParam String id) {
        return addressRepository.findById(id);
    }

    @Operation(summary = "Get All Patient Addresses")
    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Operation(summary = "Update Patient Address")
    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Address address) {
        addressRepository.update(address);
    }
}
