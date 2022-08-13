package com.mygdx.game.drawing.monsters.orangeMonster.orangeEatenDrawing;

import com.mygdx.game.TheLastLife;

public class OrangeDrawEaten extends TheLastLife {
    public OrangeDrawEaten()
    {
        if(isOrangeRightPngEaten==true){
            batchOrangeEaten.begin();
            batchOrangeEaten.draw(orangeMonsterRightEaten,orangeGhostX-(orangeWidthPngEaten/2),orangeGhostY-(orangeHeightPngEaten/2));
            batchOrangeEaten.end();
        }
        else{
            batchOrangeEaten.begin();
            batchOrangeEaten.draw(orangeMonsterLeftEaten,orangeGhostX-(orangeWidthPngEaten/2),orangeGhostY-(orangeHeightPngEaten/2));
            batchOrangeEaten.end();
        }
    }
}
