package com.mygdx.game.drawing.monsters.redMonster.redFrightenedDrawing;

import com.mygdx.game.TheLastLife;

public class RedDrawFrightened extends TheLastLife {
    public RedDrawFrightened()
    {
        if(isRedRightPngFri==true){
            batchRedFri.begin();
            batchRedFri.draw(redMonsterRightFri,redGhostX-(redWidthPng/2),redGhostY-(redHeightPng/2));
            batchRedFri.end();
        }
        else{
            batchRedFri.begin();
            batchRedFri.draw(redMonsterLeftFri,redGhostX-(redWidthPng/2),redGhostY-(redHeightPng/2));
            batchRedFri.end();
        }
    }
}
