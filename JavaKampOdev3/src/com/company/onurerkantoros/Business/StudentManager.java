package com.company.onurerkantoros.Business;

import com.company.onurerkantoros.Models.Student;
import com.company.onurerkantoros.Models.User;

public class StudentManager extends UserManager{
    Student student;

    public StudentManager(Student student) {
        this.student = student;
    }

    @Override
    public void add() {
        System.out.println(student.name+" öğrencisi eklendi");
    }

    @Override
    public void delete() {
        System.out.println(student.name+" öğrencisi silindi.");
    }
}
