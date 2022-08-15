package com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithPinkMonsterInChaseMode extends TheLastLife {
    public CollisionWithPinkMonsterInChaseMode()
    {
        boolean collided = false;

        if(Math.abs(pinkGhostX-arcX)<=20  && pinkGhostY==arcY) collided = true;
        if(Math.abs(pinkGhostY-arcY)<=25 && pinkGhostX==arcX) collided = true;

        if(collided)
        {
            SetAllVariablesForNewRound setAllVariablesForNewRound = new SetAllVariablesForNewRound();
        }
    }
}
