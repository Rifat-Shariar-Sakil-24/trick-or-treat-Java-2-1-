package com.mygdx.game.drawing.monsters.redMonster.redNormalDrawing;

import com.mygdx.game.TheLastLife;

public class RedDrawNormal extends TheLastLife {
    public RedDrawNormal()
    {
        if(isRedRightPng==true){
          batchRed.begin();
          batchRed.draw(redMonsterRight,redGhostX-(redWidthPng/2),redGhostY-(redHeightPng/2));
          batchRed.end();
        }
        else{
            batchRed.begin();
            batchRed.draw(redMonsterLeft,redGhostX-(redWidthPng/2),redGhostY-(redHeightPng/2));
            batchRed.end();
        }
    }
}
