package com.mygdx.game.screens;

import com.mygdx.game.TheLastLife;

public class YourScore extends TheLastLife {
    public YourScore(){
        batch.begin();
        batch.draw(yourScoreImg,0,0);
        batch.end();
    }
}
