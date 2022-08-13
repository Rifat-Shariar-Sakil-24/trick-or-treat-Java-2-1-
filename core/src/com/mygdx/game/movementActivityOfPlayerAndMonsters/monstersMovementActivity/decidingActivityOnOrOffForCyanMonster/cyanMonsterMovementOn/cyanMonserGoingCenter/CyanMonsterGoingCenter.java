package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonserGoingCenter;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;

public class CyanMonsterGoingCenter extends TheLastLife {
    public CyanMonsterGoingCenter()
    {
        cyanGhostX+=cyanGhostMove;
        drawCyanMonster();
        if(cyanGhostX==pinkGhostXInitial) cyanGhostCenterOfGhostHouse = true;
    }

    private void drawCyanMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CYAN);
        shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawNormal cyanDraw = new CyanDrawNormal();
    }

}
