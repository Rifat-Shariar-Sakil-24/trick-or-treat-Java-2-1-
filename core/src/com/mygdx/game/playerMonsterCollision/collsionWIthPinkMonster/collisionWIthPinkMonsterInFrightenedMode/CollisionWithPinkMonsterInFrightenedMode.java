package com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInFrightenedMode;

import com.mygdx.game.TheLastLife;

public class CollisionWithPinkMonsterInFrightenedMode extends TheLastLife {
    public CollisionWithPinkMonsterInFrightenedMode()
    {
        boolean collided = false;

        if(Math.abs(pinkGhostX-arcX)<=20  && pinkGhostY==arcY) collided = true;
        if(Math.abs(pinkGhostY-arcY)<=25 && pinkGhostX==arcX) collided = true;

        if(collided)
        {
            pinkGhostMovementOn = false;
            pinkGhostFrightenedModeOn = false;
            pinkGhostChaseModeOn = false;
            pinkGhostScatterModeOn = false;
            pinkGhostEatenMode = true;
        }
    }
}
