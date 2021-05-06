package com.company.onurerkantoros.abstracts;


import com.company.onurerkantoros.models.Gamer;

public interface GamerService {
    void add(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
    Gamer getGamer(int id);
}
