package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class PhysicalExamination {
    @Id
    private String id;
    @Field
    private String vitalSigns;
    @Field
    private MusclePower musclePower;
    @Field
    private String systemExaminations;

    public PhysicalExamination(String id, String vitalSigns, MusclePower musclePower, String systemExaminations) {
        this.id = id;
        this.vitalSigns = vitalSigns;
        this.musclePower = musclePower;
        this.systemExaminations = systemExaminations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public MusclePower getMusclePower() {
        return musclePower;
    }

    public void setMusclePower(MusclePower musclePower) {
        this.musclePower = musclePower;
    }

    public String getSystemExaminations() {
        return systemExaminations;
    }

    public void setSystemExaminations(String systemExaminations) {
        this.systemExaminations = systemExaminations;
    }

    @Override
    public String toString() {
        return "PhysicalExamination{" +
                "id='" + id + '\'' +
                ", vitalSigns='" + vitalSigns + '\'' +
                ", musclePower=" + musclePower +
                ", systemExaminations='" + systemExaminations + '\'' +
                '}';
    }
}
