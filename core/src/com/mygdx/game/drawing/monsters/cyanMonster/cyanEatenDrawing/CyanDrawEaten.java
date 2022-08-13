package com.mygdx.game.drawing.monsters.cyanMonster.cyanEatenDrawing;

import com.mygdx.game.TheLastLife;

public class CyanDrawEaten extends TheLastLife {
    public CyanDrawEaten()
    {
        if(isCyanRightPngEaten==true){
            batchCyanEaten.begin();
            batchCyanEaten.draw(cyanMonsterRightEaten,cyanGhostX-(cyanWidthPngEaten/2),cyanGhostY-(cyanHeightPngEaten/2));
            batchCyanEaten.end();
        }
        else{
            batchCyanEaten.begin();
            batchCyanEaten.draw(cyanMonsterLeftEaten,cyanGhostX-(cyanWidthPngEaten/2),cyanGhostY-(cyanHeightPngEaten/2));
            batchCyanEaten.end();
        }
    }
}
