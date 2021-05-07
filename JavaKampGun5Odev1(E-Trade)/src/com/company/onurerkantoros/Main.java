package com.company.onurerkantoros;

import com.company.onurerkantoros.business.concretes.MainLoginManager;
import com.company.onurerkantoros.business.concretes.MainRegisterManager;
import com.company.onurerkantoros.business.concretes.ValidationManager;
import com.company.onurerkantoros.core.GoogleAdapter.GoogleServiceLoginAdapter;
import com.company.onurerkantoros.core.GoogleAdapter.GoogleServiceRegisterAdapter;
import com.company.onurerkantoros.dataAccess.concretes.XFrameworkDao;
import com.company.onurerkantoros.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        MainRegisterManager registerManager = new MainRegisterManager(new XFrameworkDao(),new ValidationManager());
        registerManager.register(new User(1,"Ahmet","Nesri","ahmet@mail.com","1234"));
        //Lütfen geçerli bir parola giriniz!
        //Kayıt başarısız.


        MainLoginManager loginManager = new MainLoginManager(new XFrameworkDao(),new ValidationManager());
        loginManager.checkLogin("hasan@mail.com","12345");
        //Lütfen geçerli bir parola giriniz!


        loginManager.checkLogin("hasan@mail.com","123456");
        //Giris başarılı. Hoşgeldin Hasan bey :)


        GoogleServiceLoginAdapter googleServiceLoginAdapter  = new GoogleServiceLoginAdapter(new ValidationManager());
        googleServiceLoginAdapter.checkLogin("onur@gmail.com","1234");
        //Lütfen geçerli bir parola giriniz!


        googleServiceLoginAdapter.checkLogin("onur@gmail.com","123456");
        //Google ile giriş deneniyor...


        GoogleServiceRegisterAdapter googleServiceRegisterAdapter = new GoogleServiceRegisterAdapter(new ValidationManager());
        googleServiceRegisterAdapter.register(new User(1,"Zeliha","Duru","zelis@gmail.com","12345"));
        //Lütfen geçerli bir parola giriniz!


        googleServiceRegisterAdapter.register(new User(1,"Zeliha","Duru","zelis@gmail.com","123456"));
        //Zeliha ismiyle GOOGLE kaydı gerçekleşti. Lütfen e-postanıza gelen doğrulama linkine tıklayınız. 
    }
}
