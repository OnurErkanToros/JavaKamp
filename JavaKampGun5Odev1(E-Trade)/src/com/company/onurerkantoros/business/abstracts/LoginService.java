package com.company.onurerkantoros.business.abstracts;

import com.company.onurerkantoros.entities.concretes.User;

public interface LoginService {
    void checkLogin(String email,String password);
}
