package com.company.onurerkantoros.abstracts;

import com.company.onurerkantoros.models.Campaign;
import com.company.onurerkantoros.models.Game;
import com.company.onurerkantoros.models.Gamer;

public interface SellService {
    void buyGame(Campaign campaign, Game game, Gamer gamer);
}
