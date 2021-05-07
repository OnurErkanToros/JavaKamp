package com.company.onurerkantoros.business.concretes;

import com.company.onurerkantoros.business.abstracts.LoginService;
import com.company.onurerkantoros.business.abstracts.ValidationService;
import com.company.onurerkantoros.dataAccess.abstracts.DataAccessService;

import com.company.onurerkantoros.entities.concretes.User;

public class MainLoginManager implements LoginService {
    private DataAccessService dataAccessService;
    private ValidationService validationService;

    public MainLoginManager(DataAccessService dataAccessService, ValidationService validationService) {
        this.dataAccessService = dataAccessService;
        this.validationService = validationService;
    }

    @Override
    public void checkLogin(String email, String password) {
        if (validationService.checkEmail(email) &&
                validationService.checkPassword(password)
        ) {
            for (User user:dataAccessService.getAllUser()){
                if(user.getEmail()==email && user.getPassword()==password){
                    System.out.println("Giris başarılı. Hoşgeldin "+user.getFirstName()+" bey :)");
                    return;
                }
            }
            System.out.println("Email yada parola yanlış!");
        }
    }
}
