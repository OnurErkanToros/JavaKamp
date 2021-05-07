package com.company.onurerkantoros.core.GoogleAdapter;

import com.company.onurerkantoros.business.abstracts.LoginService;
import com.company.onurerkantoros.business.abstracts.ValidationService;
import com.company.onurerkantoros.googleAuthService.GoogleLogin;

public class GoogleServiceLoginAdapter implements LoginService {
    private ValidationService validationService;
    private GoogleLogin login;

    public GoogleServiceLoginAdapter(ValidationService validationService) {
        this.validationService = validationService;
        this.login=new GoogleLogin();
    }

    @Override
    public void checkLogin(String email, String password) {
        if(validationService.checkEmail(email) && validationService.checkPassword(password)){
            login.login(email,password);
        }
    }
}
