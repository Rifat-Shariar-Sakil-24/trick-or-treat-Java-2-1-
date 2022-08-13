package com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing;

import com.mygdx.game.TheLastLife;


public class CyanDrawNormal extends TheLastLife {
    public CyanDrawNormal()
    {
        if(isCyanRightPng==true){
            batchCyan.begin();
            batchCyan.draw(cyanMonsterRight,cyanGhostX-(cyanWidthPng/2),cyanGhostY-(cyanHeightPng/2));
            batchCyan.end();
        }
        else{
            batchCyan.begin();
            batchCyan.draw(cyanMonsterLeft,cyanGhostX-(cyanWidthPng/2),cyanGhostY-(cyanHeightPng/2));
            batchCyan.end();
        }
    }
}
