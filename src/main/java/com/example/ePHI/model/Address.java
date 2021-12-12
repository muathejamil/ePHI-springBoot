package com.example.ePHI.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Address {
    @Id
    private String id;

    @Field
    private String neighborhoodName;

    @Field
    private String streetName;

    @Field
    private String zipCode;

    @Field
    private String building;

    @Field
    private int apartment;

    public Address(
            String id, String neighborhoodName,
            String streetName, String zipCode,
            String building, int apartment
    ) {
        this.id = id;
        this.neighborhoodName = neighborhoodName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.building = building;
        this.apartment = apartment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        neighborhoodName = neighborhoodName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", NeighborhoodName='" + neighborhoodName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", building='" + building + '\'' +
                ", apartment=" + apartment +
                '}';
    }
}
