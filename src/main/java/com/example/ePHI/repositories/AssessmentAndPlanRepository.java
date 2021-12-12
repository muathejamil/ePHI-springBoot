package com.example.ePHI.repositories;

import com.example.ePHI.model.AssessmentAndPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssessmentAndPlanRepository extends MongoRepository<AssessmentAndPlan, String> {
    AssessmentAndPlan update(AssessmentAndPlan entity);
}
