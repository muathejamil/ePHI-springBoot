package com.example.ePHI.repositories;

import com.example.ePHI.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
    Report update(Report entity);
}
