package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class AssessmentAndPlan {
    @Id
    private String id;
    @Field
    private String plan;
    @Field
    private Diagnosis diagnosis;
    @Field
    private Medication medication;

    public AssessmentAndPlan(String id, String plan, Diagnosis diagnosis, Medication medication) {
        this.id = id;
        this.plan = plan;
        this.diagnosis = diagnosis;
        this.medication = medication;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    @Override
    public String toString() {
        return "AssessmentAndPlan{" +
                "id='" + id + '\'' +
                ", plan='" + plan + '\'' +
                ", diagnosis=" + diagnosis +
                ", medication=" + medication +
                '}';
    }
}
