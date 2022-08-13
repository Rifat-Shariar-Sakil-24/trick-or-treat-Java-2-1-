package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToInsideGhostHouse;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkEatenDrawing.PinkDrawEaten;

public class PinkMonsterToInsideGhostHouse extends TheLastLife {
    public PinkMonsterToInsideGhostHouse()
    {
       drawPinkMonster();
       pinkGhostY-=pinkGhostMove;
    }

    private void drawPinkMonster() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawEaten pinkDrawEaten = new PinkDrawEaten();
    }
}
