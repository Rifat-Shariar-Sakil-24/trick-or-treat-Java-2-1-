package com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.collisionWithOrangeMonsterInFrightenedMode;

import com.mygdx.game.TheLastLife;

public class CollisionWithOrangeMonsterInFrightenedMode extends TheLastLife {
    public CollisionWithOrangeMonsterInFrightenedMode()
    {
        boolean collided = false;

        if(Math.abs(orangeGhostX-arcX)<=2  && orangeGhostY==arcY) collided = true;
        if(Math.abs(orangeGhostY-arcY)<=2 && orangeGhostX==arcX) collided = true;

        if(collided)
        {
            orangeGhostFrightenedModeOn = false;
            orangeGhostChaseModeOn = false;
            orangeGhostScatterModeOn = false;
            orangeGhostEatenMode = true;
        }
    }
}
