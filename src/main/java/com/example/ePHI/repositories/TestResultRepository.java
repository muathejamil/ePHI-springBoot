package com.example.ePHI.repositories;

import com.example.ePHI.model.TestResult;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestResultRepository extends MongoRepository<TestResult, String> {
    TestResult update(TestResult entity);

}
