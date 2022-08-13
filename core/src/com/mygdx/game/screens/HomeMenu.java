package com.mygdx.game.screens;

import com.mygdx.game.TheLastLife;

public class HomeMenu extends TheLastLife {
    public HomeMenu(){
        batch.begin();
        batch.draw(menuImg,0,0);
        batch.end();
    }
}
