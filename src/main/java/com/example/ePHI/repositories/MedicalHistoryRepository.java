package com.example.ePHI.repositories;

import com.example.ePHI.model.MedicalHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalHistoryRepository extends MongoRepository<MedicalHistory, String> {
    MedicalHistory update(MedicalHistory entity);
}
