package com.company;

import java.time.Instant;

public class Employee {
    private String Name;
    private int id;
    private String description;
    private Instant peru;
    private Instant peru1;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", id=" + id +

                '}';
    }
}
