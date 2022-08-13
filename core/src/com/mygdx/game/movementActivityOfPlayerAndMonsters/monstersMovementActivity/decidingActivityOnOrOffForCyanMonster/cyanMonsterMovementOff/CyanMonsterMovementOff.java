package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOff;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;

public class CyanMonsterMovementOff extends TheLastLife {
    public CyanMonsterMovementOff()
    {
         justDrawCyanMonster();
    }

    private void justDrawCyanMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CYAN);
        shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawNormal cyanDraw = new CyanDrawNormal();
    }
}
