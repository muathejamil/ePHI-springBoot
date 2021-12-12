package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Diagnosis {
    @Id
    private String id;
    @Field
    private String problem;
    @Field
    private String relatedTo;
    @Field
    private String signsAndSymptoms;

    public Diagnosis(String id, String problem, String relatedTo, String signsAndSymptoms) {
        this.id = id;
        this.problem = problem;
        this.relatedTo = relatedTo;
        this.signsAndSymptoms = signsAndSymptoms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;
    }

    public String getSignsAndSymptoms() {
        return signsAndSymptoms;
    }

    public void setSignsAndSymptoms(String signsAndSymptoms) {
        this.signsAndSymptoms = signsAndSymptoms;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "id='" + id + '\'' +
                ", problem='" + problem + '\'' +
                ", relatedTo='" + relatedTo + '\'' +
                ", signsAndSymptoms='" + signsAndSymptoms + '\'' +
                '}';
    }
}
