package com.example.ePHI.model;

import com.example.ePHI.constants.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Patient {
    @Id
    private String id;
    @Field
    private String patientName;
    @Field
    private Contact contact;
    @Field
    private Gender gender;
    @Field
    private int patientAge;
    @Field
    private Date dateOfBirth;

    @Field
    private Address patientAddress;

    @Field(name = "patientImageUrl")
    private String patientImage;

    public Patient(
            String id, String patientName,
            int patientAge, Address patientAddress,
            Date dateOfBirth, Gender gender,
            Contact contact, String patientImage
    ) {
        this.id = id;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contact = contact;
        this.patientImage = patientImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public Address getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(Address patientAddress) {
        this.patientAddress = patientAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getPatientImage() {
        return patientImage;
    }

    public void setPatientImage(String patientImage) {
        this.patientImage = patientImage;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", patientName='" + patientName + '\'' +
                ", contact=" + contact +
                ", gender=" + gender +
                ", patientAge=" + patientAge +
                ", dateOfBirth=" + dateOfBirth +
                ", patientAddress=" + patientAddress +
                ", patientImage='" + patientImage + '\'' +
                '}';
    }
}
