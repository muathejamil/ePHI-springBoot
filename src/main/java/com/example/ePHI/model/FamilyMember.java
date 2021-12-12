package com.example.ePHI.model;

import com.example.ePHI.constants.ImmediateFamilyMembers;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class FamilyMember {
    @Id
    private String id;
    @Field
    private ImmediateFamilyMembers immediateFamilyMembers;
    @Field
    private String healthStatus;

    public FamilyMember(String id, ImmediateFamilyMembers immediateFamilyMembers, String healthStatus) {
        this.id = id;
        this.immediateFamilyMembers = immediateFamilyMembers;
        this.healthStatus = healthStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImmediateFamilyMembers getImmediateFamilyMembers() {
        return immediateFamilyMembers;
    }

    public void setImmediateFamilyMembers(ImmediateFamilyMembers immediateFamilyMembers) {
        this.immediateFamilyMembers = immediateFamilyMembers;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "id='" + id + '\'' +
                ", immediateFamilyMembers=" + immediateFamilyMembers +
                ", healthStatus='" + healthStatus + '\'' +
                '}';
    }
}
