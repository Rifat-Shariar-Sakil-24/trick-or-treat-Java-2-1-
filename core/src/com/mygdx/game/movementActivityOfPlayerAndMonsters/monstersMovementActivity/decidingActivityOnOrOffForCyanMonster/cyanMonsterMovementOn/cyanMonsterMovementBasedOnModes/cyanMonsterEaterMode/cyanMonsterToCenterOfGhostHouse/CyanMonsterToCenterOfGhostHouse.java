package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToCenterOfGhostHouse;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanEatenDrawing.CyanDrawEaten;

public class CyanMonsterToCenterOfGhostHouse extends TheLastLife {
    public CyanMonsterToCenterOfGhostHouse()
    {
        drawCyanMonster();
        cyanGhostY -= cyanGhostMove;

    }

    private void drawCyanMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawEaten cyanDrawEaten = new CyanDrawEaten();
    }
}
