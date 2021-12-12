package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document
public class TestResult {
    @Id
    private String id;
    @Field
    private String testName;
    @Field
    private Date TestDate;
    @Field
    private String testResult;
    @Field
    private String labName;
    @Field
    private List<String> testAttachments; // list of test attachments such as X-ray or any thing could be helpful to the doctor.

    public TestResult(
            String id, String testName,
            Date testDate, String testResult,
            String labName, List<String> testAttachments
    ) {
        this.id = id;
        this.testName = testName;
        TestDate = testDate;
        this.testResult = testResult;
        this.labName = labName;
        this.testAttachments = testAttachments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Date getTestDate() {
        return TestDate;
    }

    public void setTestDate(Date testDate) {
        TestDate = testDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public List<String> getTestAttachments() {
        return testAttachments;
    }

    public void setTestAttachments(List<String> testAttachments) {
        this.testAttachments = testAttachments;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "id='" + id + '\'' +
                ", testName='" + testName + '\'' +
                ", TestDate=" + TestDate +
                ", testResult='" + testResult + '\'' +
                ", labName='" + labName + '\'' +
                ", testAttachments=" + testAttachments +
                '}';
    }
}
