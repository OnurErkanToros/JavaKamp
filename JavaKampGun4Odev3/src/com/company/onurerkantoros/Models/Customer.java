package com.company.onurerkantoros.Models;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String nationaltyID;
    private int birthYear;

    public Customer(int id, String firstName, String lastName, String nationaltyID,int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationaltyID = nationaltyID;
        this.birthYear=birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationaltyID() {
        return nationaltyID;
    }

    public void setNationaltyID(String nationaltyID) {
        this.nationaltyID = nationaltyID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
