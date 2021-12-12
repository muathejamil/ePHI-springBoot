package com.example.ePHI.repositories;

import com.example.ePHI.model.Insurance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsuranceRepository extends MongoRepository<Insurance, String> {
    Insurance update(Insurance entity);
}
