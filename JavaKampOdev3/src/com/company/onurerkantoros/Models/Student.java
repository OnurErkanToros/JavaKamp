package com.company.onurerkantoros.Models;

public class Student  extends User {
    public String city;
    public String schoolName;
    public String studentNumber;


    public Student(int id, String name, String surname,
                   String email, String password,String city,
                   String schoolName,String studentNumber)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.city=city;
        this.schoolName=schoolName;
        this.studentNumber=studentNumber;
    }
}
