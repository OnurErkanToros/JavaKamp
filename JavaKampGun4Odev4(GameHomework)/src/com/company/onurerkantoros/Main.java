package com.company.onurerkantoros;

import com.company.onurerkantoros.abstracts.Entity;
import com.company.onurerkantoros.abstracts.SellService;
import com.company.onurerkantoros.adapter.MernisCheckManagerAdapter;
import com.company.onurerkantoros.adapter.MyCheckManagerAdapter;
import com.company.onurerkantoros.concretes.GamerManager;
import com.company.onurerkantoros.concretes.SellManager;
import com.company.onurerkantoros.models.Campaign;
import com.company.onurerkantoros.models.Game;
import com.company.onurerkantoros.models.Gamer;

public class Main {

    public static void main(String[] args) {
        Campaign campaign = new Campaign(1,"Black Friday",30);
        Gamer gamer = new Gamer(1,"Onur Erkan","Toros",1991,"12332112312");
        Game game = new Game(1,"Counter Strike 1.6",40);
        GamerManager gamerManager = new GamerManager(new MernisCheckManagerAdapter());
        GamerManager gamerManager1 = new GamerManager(new MyCheckManagerAdapter());

        gamerManager.add(gamer);


        gamerManager1.add(gamer);


        SellService sellService = new SellManager();
        sellService.buyGame(campaign,game,gamer);
    }
}
