package com.mygdx.game.drawing.monsters.cyanMonster.cyanFrightenedDrawing;

import com.mygdx.game.TheLastLife;

public class CyanDrawFrightened extends TheLastLife {
    public CyanDrawFrightened()
    {
        if(isCyanRightPngFri==true){
            batchRedFri.begin();
            batchRedFri.draw(cyanMonsterRightFri,cyanGhostX-(cyanWidthPng/2),cyanGhostY-(cyanHeightPng/2));
            batchRedFri.end();
        }
        else{
            batchRedFri.begin();
            batchRedFri.draw(cyanMonsterLeftFri,cyanGhostX-(cyanWidthPng/2),cyanGhostY-(cyanHeightPng/2));
            batchRedFri.end();
        }
    }
}
