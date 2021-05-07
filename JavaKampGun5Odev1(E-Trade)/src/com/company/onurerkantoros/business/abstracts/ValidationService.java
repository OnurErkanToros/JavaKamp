package com.company.onurerkantoros.business.abstracts;

public interface ValidationService {
    boolean checkEmail(String email);
    boolean checkPassword(String password);
    boolean checkName(String name);
    boolean checkSurname(String surname);
}
