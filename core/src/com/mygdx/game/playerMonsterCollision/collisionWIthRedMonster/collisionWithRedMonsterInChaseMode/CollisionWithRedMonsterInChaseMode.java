package com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithRedMonsterInChaseMode extends TheLastLife {
    public CollisionWithRedMonsterInChaseMode()
    {
        boolean collided = false;

        if(Math.abs(redGhostX-arcX)<=2  && redGhostY==arcY) collided = true;
        if(Math.abs(redGhostY-arcY)<=2 && redGhostX==arcX) collided = true;

        if(collided)
        {
            SetAllVariablesForNewRound setAllVariablesForNewRound = new SetAllVariablesForNewRound();
        }
    }

}
