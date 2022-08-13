package com.mygdx.game.drawing.monsters.pinkMonster.pinkFrightenedDrawing;

import com.mygdx.game.TheLastLife;

public class PinkDrawFrightened extends TheLastLife {
    public PinkDrawFrightened()
    {
        if(isPinkRightPngFri==true){
            batchRedFri.begin();
            batchRedFri.draw(pinkMonsterRightFri,pinkGhostX-(pinkWidthPng/2),pinkGhostY-(pinkHeightPng/2));
            batchRedFri.end();
        }
        else{
            batchRedFri.begin();
            batchRedFri.draw(pinkMonsterLeftFri,pinkGhostX-(pinkWidthPng/2),pinkGhostY-(pinkHeightPng/2));
            batchRedFri.end();
        }
    }
}
