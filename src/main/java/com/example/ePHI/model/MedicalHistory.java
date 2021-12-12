package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
public class MedicalHistory {
    @Id
    private String id;
    @Field
    private Habits habits;
    @Field
    private List<Medication> medications;

    public MedicalHistory(String id, Habits habits, List<Medication> medications) {
        this.id = id;
        this.habits = habits;
        this.medications = medications;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Habits getHabits() {
        return habits;
    }

    public void setHabits(Habits habits) {
        this.habits = habits;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "id='" + id + '\'' +
                ", habits=" + habits +
                ", medications=" + medications +
                '}';
    }
}
