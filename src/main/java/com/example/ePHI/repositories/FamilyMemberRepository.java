package com.example.ePHI.repositories;

import com.example.ePHI.model.FamilyMember;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FamilyMemberRepository extends MongoRepository<FamilyMember, String> {
    FamilyMember update(FamilyMember familyMember);
}
