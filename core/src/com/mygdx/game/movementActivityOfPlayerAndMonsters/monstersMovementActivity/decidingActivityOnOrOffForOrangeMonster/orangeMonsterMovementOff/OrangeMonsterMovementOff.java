package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOff;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing.OrangeDrawNormal;

public class OrangeMonsterMovementOff extends TheLastLife {
    public OrangeMonsterMovementOff()
    {
        justDrawOrangeMonster();
    }

    private void justDrawOrangeMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.CYAN);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawNormal orangeDrawNormal = new OrangeDrawNormal();
    }
}
