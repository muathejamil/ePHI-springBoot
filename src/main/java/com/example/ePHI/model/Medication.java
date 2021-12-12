package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Medication {
    @Id
    private String id;
    @Field
    private String medicationName;
    @Field
    private String Dosing;
    @Field
    private String prescription;
    @Field
    private Date expiryDate;

    public Medication(
            String id, String medicationName,
            String dosing, Date expiryDate, String prescription) {
        this.id = id;
        this.medicationName = medicationName;
        Dosing = dosing;
        this.expiryDate = expiryDate;
        this.prescription = prescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosing() {
        return Dosing;
    }

    public void setDosing(String dosing) {
        Dosing = dosing;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescriptions(String prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", medicationName='" + medicationName + '\'' +
                ", Dosing='" + Dosing + '\'' +
                ", prescriptions='" + prescription + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
