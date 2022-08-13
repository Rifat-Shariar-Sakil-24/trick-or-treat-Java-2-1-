package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterGoingOut;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing.OrangeDrawNormal;

public class OrangeMonsterGoingOut extends TheLastLife {
    public OrangeMonsterGoingOut()
    {
        orangeGhostY+=orangeGhostMove;
        drawOrangeMonster();
        if(orangeGhostY==redGhostYInitial) {orangeGhostOutOfGhostHouse = true;

            orangeLeft = false;
            orangeRight=true;isOrangeLeftPng=false;isOrangeRightPng=true;}
    }

    private void drawOrangeMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.CYAN);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawNormal orangeDrawNormal= new OrangeDrawNormal();
    }
}
