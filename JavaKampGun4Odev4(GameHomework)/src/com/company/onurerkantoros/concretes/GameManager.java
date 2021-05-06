package com.company.onurerkantoros.concretes;

import com.company.onurerkantoros.abstracts.GameService;
import com.company.onurerkantoros.models.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName()+" isimli oyun eklendi.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName()+" isimli oyun güncellendi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+" isimli oyun silindi.");
    }

    @Override
    public Game getGame(int id) {
        return null;
    }
}
