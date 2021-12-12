package com.example.ePHI.model;

import com.example.ePHI.constants.MuscleType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class MusclePower {
    @Id
    private String id;
    @Field
    private MuscleType muscleType;
    @Field
    private Diagnosis diagnosis;

    public MusclePower(String id, MuscleType muscleType, Diagnosis diagnosis) {
        this.id = id;
        this.muscleType = muscleType;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MuscleType getMuscleType() {
        return muscleType;
    }

    public void setMuscleType(MuscleType muscleType) {
        this.muscleType = muscleType;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "MusclePower{" +
                "id='" + id + '\'' +
                ", muscleType=" + muscleType +
                ", diagnosis=" + diagnosis +
                '}';
    }
}
