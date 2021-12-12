package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Insurance {
    @Id
    private String Id;
    @Field
    private String provider;
    @Field
    private String agent;
    @Field
    private String coverage;
    @Field
    private String policyNumber;
    @Field
    private String phone;

    public Insurance(
            String id, String provider,
            String agent, String coverage,
            String policyNumber, String phone
    ) {
        Id = id;
        this.provider = provider;
        this.agent = agent;
        this.coverage = coverage;
        this.policyNumber = policyNumber;
        this.phone = phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "Id='" + Id + '\'' +
                ", provider='" + provider + '\'' +
                ", agent='" + agent + '\'' +
                ", coverage='" + coverage + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
