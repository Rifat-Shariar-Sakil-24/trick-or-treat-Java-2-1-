package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode.orangeMonsterToCenterOfGhostHouse;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanEatenDrawing.CyanDrawEaten;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeEatenDrawing.OrangeDrawEaten;

public class OrangeMonsterToCenterOfGhostHouse extends TheLastLife {
    public OrangeMonsterToCenterOfGhostHouse()
    {
        drawOrangeMonster();
        orangeGhostY -= orangeGhostMove;

    }

    private void drawOrangeMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.WHITE);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawEaten orangeDrawEaten = new OrangeDrawEaten();
    }
}
