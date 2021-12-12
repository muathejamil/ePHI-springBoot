package com.example.ePHI.repositories;

import com.example.ePHI.model.EPHI;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EPHiRepository extends MongoRepository<EPHI, String > {
    EPHI update(EPHI entity);
}
