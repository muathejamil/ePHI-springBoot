package com.example.ePHI.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Visit {
    @Id
    private String id;
    @Field
    private Date visitDate;
    @Field
    private Diagnosis diagnosis;
    @Field
    private Medication medication;

    public Visit(String id, Date visitDate, Diagnosis diagnosis, Medication medication) {
        this.id = id;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.medication = medication;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
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
        return "Visit{" +
                "id='" + id + '\'' +
                ", visitDate=" + visitDate +
                ", diagnosis=" + diagnosis +
                ", medication=" + medication +
                '}';
    }
}
