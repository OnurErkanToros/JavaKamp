package com.company.onurerkantoros.Business;


import com.company.onurerkantoros.Models.Instructor;
import com.company.onurerkantoros.Models.User;

public class InstructorManager extends UserManager{
    Instructor instructor;

    public InstructorManager(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void add() {
        System.out.println(instructor.name+" isimli eğitmen eklendi.");
    }

    @Override
    public void delete() {
        System.out.println(instructor.name+" isimli eğitmen silindi.");
    }
}
