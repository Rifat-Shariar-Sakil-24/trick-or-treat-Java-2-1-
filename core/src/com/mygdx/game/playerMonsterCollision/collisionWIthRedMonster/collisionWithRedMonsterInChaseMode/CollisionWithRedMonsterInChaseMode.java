package com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithRedMonsterInChaseMode extends TheLastLife {
    public CollisionWithRedMonsterInChaseMode()
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
