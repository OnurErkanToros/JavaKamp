package com.company.onurerkantoros.abstracts;

import com.company.onurerkantoros.models.Game;

public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    Game getGame(int id);
}
