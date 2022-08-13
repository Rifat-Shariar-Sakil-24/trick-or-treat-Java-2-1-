package com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOff;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.player.PlayerDraw;

public class PlayerMovementOff extends TheLastLife {
    public PlayerMovementOff()
    {
        justPlayerDraw();
    }

    private void justPlayerDraw() {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.YELLOW);

        if(arcLeft){shapeRenderer.arc(arcX,arcY,arcRadius,-135,270);}
        else if(arcUp) {shapeRenderer.arc(arcX,arcY,arcRadius,135,270);}
        else if(arcDown){shapeRenderer.arc(arcX,arcY,arcRadius,-45,270);}
        else {shapeRenderer.arc(arcX,arcY,arcRadius,45,270);}

        shapeRenderer.end();*/
        PlayerDraw playerDraw = new PlayerDraw();
    }
}
