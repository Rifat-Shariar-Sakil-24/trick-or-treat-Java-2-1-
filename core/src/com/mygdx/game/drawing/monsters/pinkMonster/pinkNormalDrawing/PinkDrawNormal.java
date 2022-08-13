package com.mygdx.game.drawing.monsters.pinkMonster.pinkNormalDrawing;

import com.mygdx.game.TheLastLife;


public class PinkDrawNormal extends TheLastLife {
    public PinkDrawNormal()
    {
        if(isPinkRightPng==true){
            batchPink.begin();
            batchPink.draw(pinkMonsterRight,pinkGhostX-(pinkWidthPng/2),pinkGhostY-(pinkHeightPng/2));
            batchPink.end();
        }
        else{
            batchPink.begin();
            batchPink.draw(pinkMonsterLeft,pinkGhostX-(pinkWidthPng/2),pinkGhostY-(pinkHeightPng/2));
            batchPink.end();
        }
    }
}
