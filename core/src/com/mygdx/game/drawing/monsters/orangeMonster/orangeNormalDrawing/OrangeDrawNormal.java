package com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing;

import com.mygdx.game.TheLastLife;

public class OrangeDrawNormal extends TheLastLife {
    public OrangeDrawNormal()
    {
        if(isOrangeRightPng==true){
            batchOrange.begin();
            batchOrange.draw(orangeMonsterRight,orangeGhostX-(orangeWidthPng/2),orangeGhostY-(orangeHeightPng/2));
            batchOrange.end();
        }
        else{
            batchOrange.begin();
            batchOrange.draw(orangeMonsterLeft,orangeGhostX-(orangeWidthPng/2),orangeGhostY-(orangeHeightPng/2));
            batchOrange.end();
        }
    }
}
