package com.company.onurerkantoros.business.concretes;

import com.company.onurerkantoros.business.abstracts.ValidationService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public  class ValidationManager implements ValidationService{
     String regex = "^(.+)@(.+)$";
    @Override
     public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        System.out.println("Lütfen geçerli bir email adresi giriniz!");
        return false;

    }

    @Override
    public boolean checkPassword(String password) {
        if(password.length()>=6){
            return true;
        }
        System.out.println("Lütfen geçerli bir parola giriniz!");
        return false;

    }

    @Override
    public boolean checkName(String name) {
        if(name.length()>=2){
            return true;
        }
        System.out.println("Lütfen geçerli isim giriniz!");
        return false;
    }

    @Override
    public boolean checkSurname(String surname) {

        if (surname.length()>=2){
            return true;
        }
        System.out.println("Lütfen geçerli soyisim giriniz!");
        return false;
    }
}
