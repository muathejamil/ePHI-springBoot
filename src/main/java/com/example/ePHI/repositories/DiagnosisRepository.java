package com.example.ePHI.repositories;

import com.example.ePHI.model.Diagnosis;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiagnosisRepository extends MongoRepository<Diagnosis, String> {
    Diagnosis update(Diagnosis entity);
}
