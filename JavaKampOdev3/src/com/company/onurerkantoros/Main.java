package com.company.onurerkantoros;

import com.company.onurerkantoros.Business.InstructorManager;
import com.company.onurerkantoros.Business.StudentManager;
import com.company.onurerkantoros.Models.Instructor;
import com.company.onurerkantoros.Models.Student;
import com.company.onurerkantoros.Models.User;

public class Main {

    public static void main(String[] args) {
        InstructorManager instructorManager = new InstructorManager(new Instructor(
                1,"Turgut", "Ünal","turgut@mail.com",
                "1234","Ağ Yapıları ve Güvenliği",
                "xyz Office","21-23"
                ));

        StudentManager studentManager = new StudentManager(new Student(
                1,"Ümit","Sarnıç","umit@mail.com",
                "1234","Isparta",
                "Süleyman Demirel Üniversitesi","263414"
        ));

        instructorManager.add();
        instructorManager.delete();


        studentManager.add();
        studentManager.delete();
    }
}
