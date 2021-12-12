package com.example.ePHI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Habits {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String disadvantage;

    public Habits(String id, String name, String disadvantage) {
        this.id = id;
        this.name = name;
        this.disadvantage = disadvantage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisadvantage() {
        return disadvantage;
    }

    public void setDisadvantage(String disadvantage) {
        this.disadvantage = disadvantage;
    }

    @Override
    public String toString() {
        return "Habits{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", disadvantage='" + disadvantage + '\'' +
                '}';
    }
}
