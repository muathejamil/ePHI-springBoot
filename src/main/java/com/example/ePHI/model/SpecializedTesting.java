package com.example.ePHI.model;

import java.util.Date;
import java.util.List;

public class SpecializedTesting extends TestResult{
    private String specializedTestingType;

    public SpecializedTesting(
            String id, String testName, Date testDate,
            String testResult, String labName,
            List<String> testAttachments, String specializedTestingType
    ) {
        super(id, testName, testDate, testResult, labName, testAttachments);
        this.specializedTestingType = specializedTestingType;
    }

    public String getSpecializedTestingType() {
        return specializedTestingType;
    }

    public void setSpecializedTestingType(String specializedTestingType) {
        this.specializedTestingType = specializedTestingType;
    }

    @Override
    public String toString() {
        return "SpecializedTesting{" +
                "specializedTestingType='" + specializedTestingType + '\'' +
                '}';
    }
}
