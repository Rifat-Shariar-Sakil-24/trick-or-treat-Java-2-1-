package com.mygdx.game.drawing.monsters.redMonster.redEatenDrawing;

import com.mygdx.game.TheLastLife;

public class RedDrawEaten extends TheLastLife {
    public RedDrawEaten()
    {
        if(isRedRightPngEaten==true){
            batchRedEaten.begin();
            batchRedEaten.draw(redMonsterRightEaten,redGhostX-(redWidthPngEaten/2),redGhostY-(redHeightPngEaten/2));
            batchRedEaten.end();
        }
        else{
            batchRedEaten.begin();
            batchRedEaten.draw(redMonsterLeftEaten,redGhostX-(redWidthPngEaten/2),redGhostY-(redHeightPngEaten/2));
            batchRedEaten.end();
        }
    }
}
