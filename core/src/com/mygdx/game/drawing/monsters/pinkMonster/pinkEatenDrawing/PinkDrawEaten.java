package com.mygdx.game.drawing.monsters.pinkMonster.pinkEatenDrawing;

import com.mygdx.game.TheLastLife;

public class PinkDrawEaten extends TheLastLife {
    public PinkDrawEaten()
    {
        if(isPinkRightPngEaten==true){
            batchPinkEaten.begin();
            batchPinkEaten.draw(pinkMonsterRightEaten,pinkGhostX-(pinkWidthPngEaten/2),pinkGhostY-(pinkHeightPngEaten/2));
            batchPinkEaten.end();
        }
        else{
            batchPinkEaten.begin();
            batchPinkEaten.draw(pinkMonsterLeftEaten,pinkGhostX-(pinkWidthPngEaten/2),pinkGhostY-(pinkHeightPngEaten/2));
            batchPinkEaten.end();
        }
    }
}
