package com.example.ePHI.repositories;

import com.example.ePHI.model.MusclePower;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusclePowerRepository extends MongoRepository<MusclePower, String> {
    MusclePower update(MusclePower entity);
}
