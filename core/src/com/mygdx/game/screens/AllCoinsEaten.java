package com.mygdx.game.screens;

import com.mygdx.game.TheLastLife;

public class AllCoinsEaten extends TheLastLife {
    public AllCoinsEaten(){
        batch.begin();
        batch.draw(allCoinsEaten,0,0);
        batch.end();
    }
}
