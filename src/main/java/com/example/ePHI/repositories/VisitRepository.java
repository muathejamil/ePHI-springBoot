package com.example.ePHI.repositories;

import com.example.ePHI.model.Visit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VisitRepository extends MongoRepository<Visit, String> {
    Visit update(Visit entity);
}
