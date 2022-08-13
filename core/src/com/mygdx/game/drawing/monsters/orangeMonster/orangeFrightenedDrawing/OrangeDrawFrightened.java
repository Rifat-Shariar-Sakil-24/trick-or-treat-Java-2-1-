package com.mygdx.game.drawing.monsters.orangeMonster.orangeFrightenedDrawing;

import com.mygdx.game.TheLastLife;

public class OrangeDrawFrightened extends TheLastLife {
    public OrangeDrawFrightened()
    {
        if(isOrangeRightPngFri==true){
            batchOrangeFri.begin();
            batchOrangeFri.draw(orangeMonsterRightFri,orangeGhostX-(orangeWidthPng/2),orangeGhostY-(orangeHeightPng/2));
            batchOrangeFri.end();
        }
        else{
            batchRedFri.begin();
            batchRedFri.draw(orangeMonsterLeftFri,orangeGhostX-(orangeWidthPng/2),orangeGhostY-(orangeHeightPng/2));
            batchRedFri.end();
        }
    }
}
