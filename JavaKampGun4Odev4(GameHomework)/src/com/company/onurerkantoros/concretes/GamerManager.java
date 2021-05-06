package com.company.onurerkantoros.concretes;

import com.company.onurerkantoros.abstracts.GamerCheckService;
import com.company.onurerkantoros.abstracts.GamerService;
import com.company.onurerkantoros.models.Gamer;

public class GamerManager implements GamerService {
    private GamerCheckService checkService;

    public GamerManager(GamerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void add(Gamer gamer) {
        try {
            if (checkService.checkGamer(gamer)) {
                System.out.println(gamer.getFirstName() + " isimli oyuncu eklendi.");
            }else {
                throw new Exception("Not valid a gamer");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" isimli oyuncu güncellendi.");

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" isimli oyuncu silindi.");

    }

    @Override
    public Gamer getGamer(int id) {
        return null;
    }
}
