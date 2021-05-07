package com.company.onurerkantoros.core.GoogleAdapter;

import com.company.onurerkantoros.business.abstracts.RegisterService;
import com.company.onurerkantoros.business.abstracts.ValidationService;
import com.company.onurerkantoros.entities.concretes.User;
import com.company.onurerkantoros.googleAuthService.GoogleRegister;

public class GoogleServiceRegisterAdapter implements RegisterService {
    private GoogleRegister register;
    private ValidationService validationService;

    public GoogleServiceRegisterAdapter(ValidationService validationService) {
        this.validationService = validationService;
        this.register = new GoogleRegister();
    }

    @Override
    public void register(User user) {
        boolean isOk =
                validationService.checkEmail(user.getEmail()) &&
                        validationService.checkPassword(user.getPassword())&&
                        validationService.checkName(user.getFirstName())&&
                        validationService.checkSurname(user.getLastName());

        if(isOk){
            register.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
        }


    }
}
