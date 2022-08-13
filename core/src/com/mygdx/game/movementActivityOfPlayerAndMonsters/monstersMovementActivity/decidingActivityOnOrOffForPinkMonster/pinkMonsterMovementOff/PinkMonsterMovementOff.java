package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOff;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkNormalDrawing.PinkDrawNormal;

public class PinkMonsterMovementOff extends TheLastLife {
    public PinkMonsterMovementOff()
    {
      justDrawPinkMonster();
    }

    private void justDrawPinkMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.PINK);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawNormal pinkDraw = new PinkDrawNormal();

    }
}
