package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode.orangeMonsterToInitialPosition;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanEatenDrawing.CyanDrawEaten;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeEatenDrawing.OrangeDrawEaten;

public class OrangeMonsterToInitialPosition extends TheLastLife {
    public OrangeMonsterToInitialPosition()
    {
        drawOrangeMonster();
        orangeGhostX += orangeGhostMove;
    }

    private void drawOrangeMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.WHITE);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawEaten orangeDrawEaten = new OrangeDrawEaten();
    }
}
