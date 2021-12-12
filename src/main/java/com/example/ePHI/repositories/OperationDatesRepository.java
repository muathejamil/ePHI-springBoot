package com.example.ePHI.repositories;

import com.example.ePHI.model.OperationDates;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperationDatesRepository extends MongoRepository<OperationDates, String> {
    OperationDates update(OperationDates entity);
}
