package com.company.onurerkantoros.Models;

public class Instructor  extends User{
    public String branch;
    public String office;
    public String hours;

    public Instructor(int id,String name,String surname,String email,String password
            ,String branch, String office, String hours)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.branch = branch;
        this.office = office;
        this.hours = hours;
    }
}
