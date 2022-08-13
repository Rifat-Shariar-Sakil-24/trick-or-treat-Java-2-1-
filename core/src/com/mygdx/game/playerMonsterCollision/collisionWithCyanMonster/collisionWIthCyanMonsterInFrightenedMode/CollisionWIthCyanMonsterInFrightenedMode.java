package com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInFrightenedMode;

import com.mygdx.game.TheLastLife;

public class CollisionWIthCyanMonsterInFrightenedMode extends TheLastLife {
    public CollisionWIthCyanMonsterInFrightenedMode()
    {
        boolean collided = false;

        if(Math.abs(cyanGhostX-arcX)<=2  && cyanGhostY==arcY) collided = true;
        if(Math.abs(cyanGhostY-arcY)<=2 && cyanGhostX==arcX) collided = true;

        if(collided)
        {
            cyanGhostFrightenedModeOn = false;
            cyanGhostChaseModeOn = false;
            cyanGhostScatterModeOn = false;
            cyanGhostEatenMode = true;
        }
    }
}
