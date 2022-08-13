package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterGoingOut;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;

public class CyanMonsterGoingOut extends TheLastLife {
    public CyanMonsterGoingOut()
    {
        cyanGhostY+=cyanGhostMove;
        drawCyanMonster();
        if(cyanGhostY==redGhostYInitial) {cyanGhostOutOfGhostHouse = true;
            cyanLeft=true;isCyanLeftPng=true;isCyanRightPng=false;}
    }

    private void drawCyanMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CYAN);
        shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawNormal cyanDraw = new CyanDrawNormal();
    }
}
