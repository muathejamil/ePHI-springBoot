package com.example.ePHI.repositories;

import com.example.ePHI.model.Medication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicationRepository extends MongoRepository<Medication, String> {
    Medication update(Medication entity);
}
