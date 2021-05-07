package com.company.onurerkantoros.dataAccess.abstracts;

import com.company.onurerkantoros.entities.concretes.User;

import java.util.List;


public interface DataAccessService {
    void add(User user);
    void update(User user);
    void delete(User user);
    User getUser(int id);
    List<User> getAllUser();
}
