package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class OperationDates {
    @Id
    private String id;
    @Field
    private String operationName;
    @Field
    private Date operationDate;
    @Field
    private String doctorName;

    public OperationDates(String id, String operationName, Date operationDate, String doctorName) {
        this.id = id;
        this.operationName = operationName;
        this.operationDate = operationDate;
        this.doctorName = doctorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "operationDates{" +
                "id='" + id + '\'' +
                ", operationName='" + operationName + '\'' +
                ", operationDate=" + operationDate +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
