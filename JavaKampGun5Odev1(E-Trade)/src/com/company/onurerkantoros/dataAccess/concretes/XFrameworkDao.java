package com.company.onurerkantoros.dataAccess.concretes;

import com.company.onurerkantoros.dataAccess.abstracts.DataAccessService;
import com.company.onurerkantoros.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class XFrameworkDao implements DataAccessService {
    static private ArrayList<User> users;
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() +" isimli kullanıcı eklendi.");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() +" isimli kullanıcı güncellendi.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() +" isimli kullanıcı silindi.");
    }

    @Override
    public User getUser(int id) {
        for(User user: getOrCreateList()){
            if(user.getId()==id){
                return user;
            }
        }
        return new User();
    }

    @Override
    public List<User> getAllUser() {
        return getOrCreateList();
    }


    //Data acces katmanındayız ve veriler normalde database'den gelmektedir.
    //Ancak halihazırda bir databasemiz olmadığı için
    //aşağıdaki method ile küçük bir database oluşturuyoruz.
    private ArrayList<User> getOrCreateList(){
        if(users==null){
            users=new ArrayList<>();
            users.add(new User(1,"Hasan","Can","hasan@mail.com","123456"));
            users.add(new User(2,"Celil","Koşan","celil@mail.com","123456"));
            users.add(new User(3,"Betül","Mahur","betul@mail.com","123456"));
        }
        return users;
    }


}
