package com.mygdx.game.screens;

import com.mygdx.game.TheLastLife;

public class HomeMenu extends TheLastLife {
    public HomeMenu(){
       // System.out.println("menus "+menuStart);
        if(menuStart==1){
            batch.begin();
            batch.draw(menuImg,0,0);
            batch.end();
        }
        else {
            batch.begin();
            batch.draw(menuImg2,0,0);
            batch.end();
        }

    }
}
