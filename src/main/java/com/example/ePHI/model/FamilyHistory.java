package com.example.ePHI.model;

import java.util.List;

public class FamilyHistory extends MedicalHistory {
    private FamilyMember familyMember;

    public FamilyHistory(
            String id, Habits habits,
            List<Medication> medications,
            FamilyMember familyMember
    ) {
        super(id, habits, medications);
        this.familyMember = familyMember;
    }

    public FamilyMember getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {
        this.familyMember = familyMember;
    }

    @Override
    public String toString() {
        return "FamilyHistory{" +
                "familyMember=" + familyMember +
                '}';
    }
}
