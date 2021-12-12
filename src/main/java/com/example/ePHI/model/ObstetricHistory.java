package com.example.ePHI.model;

import com.example.ePHI.constants.Gender;

import java.util.List;

public class ObstetricHistory extends MedicalHistory {

    private Range periodOfBeingPregnant;
    private String complications;
    private Gender babyGender;

    public ObstetricHistory(
            String id, Habits habits,
            List<Medication> medications,
            Range periodOfBeingPregnant,
            String complications, Gender babyGender
    ) {
        super(id, habits, medications);
        this.periodOfBeingPregnant = periodOfBeingPregnant;
        this.complications = complications;
        this.babyGender = babyGender;
    }

    public Range getPeriodOfBeingPregnant() {
        return periodOfBeingPregnant;
    }

    public void setPeriodOfBeingPregnant(Range periodOfBeingPregnant) {
        this.periodOfBeingPregnant = periodOfBeingPregnant;
    }

    public String getComplications() {
        return complications;
    }

    public void setComplications(String complications) {
        this.complications = complications;
    }

    public Gender getBabyGender() {
        return babyGender;
    }

    public void setBabyGender(Gender babyGender) {
        this.babyGender = babyGender;
    }

    @Override
    public String toString() {
        return "ObstetricHistory{" +
                "periodOfBeingPregnant=" + periodOfBeingPregnant +
                ", complications='" + complications + '\'' +
                ", babyGender=" + babyGender +
                '}';
    }
}
