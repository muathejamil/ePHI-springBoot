package com.example.ePHI.repositories;

import com.example.ePHI.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
     Address update(Address entity);
}
