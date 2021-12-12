package com.example.ePHI.repositories;

import com.example.ePHI.constants.Gender;
import com.example.ePHI.model.Address;
import com.example.ePHI.model.Contact;
import com.example.ePHI.model.EPHI;
import com.example.ePHI.model.Patient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClients;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EPHiRepositoryImplTest {

    @Test
    void save() throws JsonProcessingException {
        Address address = new Address(null, "al masayyf", "al-ersal", "112233",
                "Building 4", 3);
        Contact contact =
                new Contact(null, "0566777788", "0234455533", "aAmin@gmail.com");
        Patient patient = new Patient(null,
                "Ahmad Amin", 22,
                address, new Date(), Gender.MALE, contact, "1122ssaszfvfav");

        EPHI ephi = new EPHI(null, patient, null, null, "red back",
                "from 2 weeks", null, null, null,
                "need more rest", null, null);


        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ephi));

//        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "myDB1");
//        EPHiRepositoryImpl epHiRepository = new EPHiRepositoryImpl(mongoOps);
//        epHiRepository.save(ephi);


    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void update() {
    }
}