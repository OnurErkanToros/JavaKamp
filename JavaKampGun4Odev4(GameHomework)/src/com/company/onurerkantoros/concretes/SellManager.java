package com.company.onurerkantoros.concretes;

import com.company.onurerkantoros.abstracts.SellService;
import com.company.onurerkantoros.models.Campaign;
import com.company.onurerkantoros.models.Game;
import com.company.onurerkantoros.models.Gamer;

public class SellManager implements SellService {
    @Override
    public void buyGame(Campaign campaign, Game game, Gamer gamer) {
        double indirim= ((game.getPrice()* campaign.getDiscount())/100);
        String message=game.getName()+" oyunu "+gamer.getFirstName()+" isimli oyuncuya "+
                campaign.getCampaignName()+" kampanyası kapsamında "+ indirim+
                "TL indirim yapılarak satıldı.";

        System.out.println(message);
    }
}
