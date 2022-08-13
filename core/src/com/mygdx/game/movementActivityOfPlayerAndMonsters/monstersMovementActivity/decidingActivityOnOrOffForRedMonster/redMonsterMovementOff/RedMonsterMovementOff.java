package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOff;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.redMonster.redNormalDrawing.RedDrawNormal;

public class RedMonsterMovementOff extends TheLastLife {
    public RedMonsterMovementOff()
    {

        //justDrawRedMonster();
        RedDrawNormal redDraw = new RedDrawNormal();
    }

    private void justDrawRedMonster() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.circle(redGhostX,redGhostY,redGhostRadius);
        shapeRenderer.end();

    }
}
