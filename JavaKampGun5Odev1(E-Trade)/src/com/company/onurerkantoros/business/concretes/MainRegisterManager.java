package com.company.onurerkantoros.business.concretes;

import com.company.onurerkantoros.business.abstracts.LoginService;
import com.company.onurerkantoros.business.abstracts.RegisterService;
import com.company.onurerkantoros.business.abstracts.ValidationService;
import com.company.onurerkantoros.dataAccess.abstracts.DataAccessService;
import com.company.onurerkantoros.entities.concretes.User;

public class MainRegisterManager implements RegisterService {
    private ValidationService validationService;
    private DataAccessService dataAccessService;

    public MainRegisterManager(DataAccessService dataAccessService, ValidationService validationService) {
        this.dataAccessService = dataAccessService;
        this.validationService = validationService;
    }

    @Override
    public void register(User user) {
        if (
                validationService.checkPassword(user.getPassword()) &&
                        validationService.checkEmail(user.getEmail()) &&
                        validationService.checkName(user.getFirstName()) &&
                        validationService.checkSurname(user.getLastName())
        ){
            dataAccessService.add(user);
            System.out.println("Lütfen mail adresinize gelen doğrulama linkine tıklayınız.");
        }else {
            System.out.println("Kayıt başarısız.");
        }
    }
}
