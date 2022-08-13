package com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWIthCyanMonsterInChaseMode extends TheLastLife {
    public CollisionWIthCyanMonsterInChaseMode()
    {
        boolean collided = false;

        if(Math.abs(cyanGhostX-arcX)<=2  && cyanGhostY==arcY) collided = true;
        if(Math.abs(cyanGhostY-arcY)<=2 && cyanGhostX==arcX) collided = true;

        if(collided)
        {
            SetAllVariablesForNewRound setAllVariablesForNewRound = new SetAllVariablesForNewRound();
        }
    }
}
