package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterGoingOut;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkNormalDrawing.PinkDrawNormal;

public class PinkMonsterGoingOut extends TheLastLife {
    public PinkMonsterGoingOut()
    {
        pinkGhostY+=pinkGhostMove;
        drawPinkMonster();
        if(pinkGhostY==redGhostYInitial)
        {
            pinkGhostOutOfGhostHouse = true;pinkLeft=true;isPinkLeftPng=true;
            isPinkRightPng = false;
        }
    }

    private void drawPinkMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.PINK);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawNormal pinkDraw = new PinkDrawNormal();
    }
}
