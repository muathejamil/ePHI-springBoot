package com.example.ePHI.repositories;

import com.example.ePHI.model.Range;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RangeRepository extends MongoRepository<Range, String> {
    Range update(Range entity);
}
