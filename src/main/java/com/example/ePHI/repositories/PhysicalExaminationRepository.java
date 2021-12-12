package com.example.ePHI.repositories;

import com.example.ePHI.model.PhysicalExamination;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhysicalExaminationRepository extends MongoRepository<PhysicalExamination, String> {
    PhysicalExamination update(PhysicalExamination entity);
}
