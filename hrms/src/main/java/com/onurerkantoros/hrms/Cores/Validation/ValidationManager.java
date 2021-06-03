package com.onurerkantoros.hrms.Cores.Validation;

import java.util.UUID;

public class ValidationManager implements ValidationService{
    @Override
    public boolean sendVerificationCodeForEmail(String email) {
        UUID uuid = UUID.randomUUID();
        String code = uuid.toString();
        System.out.println("Doğrulama kodu şu adrese gönderildi: "+email+" kod:"+code);
        return true;
    }
}
