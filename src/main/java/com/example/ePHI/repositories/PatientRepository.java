package com.example.ePHI.repositories;

import com.example.ePHI.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient update(Patient entity);
}
