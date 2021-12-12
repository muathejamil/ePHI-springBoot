package com.example.ePHI.repositories;

import com.example.ePHI.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact update(Contact entity);
}
