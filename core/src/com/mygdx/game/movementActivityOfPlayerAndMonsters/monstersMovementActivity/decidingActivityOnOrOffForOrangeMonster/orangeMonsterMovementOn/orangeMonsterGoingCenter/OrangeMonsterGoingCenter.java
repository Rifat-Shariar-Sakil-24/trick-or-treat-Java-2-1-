package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterGoingCenter;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing.OrangeDrawNormal;

public class OrangeMonsterGoingCenter extends TheLastLife {
    public OrangeMonsterGoingCenter()
    {
        orangeGhostX-=orangeGhostMove;
        drawOrangeMonster();
        if(orangeGhostX==pinkGhostXInitial) {orangeGhostCenterOfGhostHouse = true;orangeGhostMovementOn=true;}

    }

    private void drawOrangeMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.CYAN);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawNormal orangeDrawNormal = new OrangeDrawNormal();
    }
}
