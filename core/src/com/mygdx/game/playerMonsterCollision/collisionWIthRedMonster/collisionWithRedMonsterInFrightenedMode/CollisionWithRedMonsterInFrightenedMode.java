package com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInFrightenedMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithRedMonsterInFrightenedMode extends TheLastLife {
    public CollisionWithRedMonsterInFrightenedMode()
    {
        boolean collided = false;

        if(Math.abs(redGhostX-arcX)<=20  && redGhostY==arcY) collided = true;
        if(Math.abs(redGhostY-arcY)<=25 && redGhostX==arcX) collided = true;

        if(collided)
        {
            redGhostMovementOn = false;
            redGhostFrightenedModeOn = false;
            redGhostChaseModeOn = false;
            redGhostScatterModeOn = false;
            redGhostEatenMode = true;
        }
    }
}
