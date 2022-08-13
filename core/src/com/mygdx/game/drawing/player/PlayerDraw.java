package com.mygdx.game.drawing.player;

import com.mygdx.game.TheLastLife;

public class PlayerDraw extends TheLastLife {
    public PlayerDraw(){
        if(isPlayerRightPng==true){
            batchPlayer.begin();
            batchPlayer.draw(playerMonsterRight,arcX-(playerWidthPng/2),arcY-(playerHeightPng/2));
            batchPlayer.end();
        }
        else {
            batchPlayer.begin();
            batchPlayer.draw(playerMonsterLeft,arcX-(playerWidthPng/2),arcY-(playerHeightPng/2));
            batchPlayer.end();
        }
    }
}
