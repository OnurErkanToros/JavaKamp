package com.company.onurerkantoros.concretes;

import com.company.onurerkantoros.abstracts.CampaignService;
import com.company.onurerkantoros.models.Campaign;
import com.company.onurerkantoros.models.Game;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya güncellendi.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" isimli kampanya silindi.");

    }

    @Override
    public void campaignSale(Campaign campaign, Game game) {
        double indirim= (campaign.getDiscount()*game.getPrice())/100;
        System.out.println(game.getName()+" isimli oyuna "+indirim+" TL indirim uygulandı.");

    }
}
