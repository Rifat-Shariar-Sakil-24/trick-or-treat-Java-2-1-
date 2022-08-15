package com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInScatterMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithRedMonsterInScatterMode extends TheLastLife {
    public CollisionWithRedMonsterInScatterMode()
    {
        boolean collided = false;

        if(Math.abs(redGhostX-arcX)<=20  && redGhostY==arcY) collided = true;
        if(Math.abs(redGhostY-arcY)<=25 && redGhostX==arcX) collided = true;

        if(collided)
        {
            SetAllVariablesForNewRound setAllVariablesForNewRound = new SetAllVariablesForNewRound();
        }
    }
}
