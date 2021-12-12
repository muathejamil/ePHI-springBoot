package com.example.ePHI.repositories;

import com.example.ePHI.model.Habits;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HabitsRepository extends MongoRepository<Habits, String> {
    Habits update(Habits entity);
}
