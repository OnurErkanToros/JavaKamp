package com.company.onurerkantoros.abstracts;

import com.company.onurerkantoros.models.Campaign;
import com.company.onurerkantoros.models.Game;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    void campaignSale(Campaign campaign, Game game);
}
