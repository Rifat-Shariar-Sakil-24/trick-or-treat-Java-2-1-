package com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.collisionWithOrangeMonsterInScatterMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.extra.setAllVariables.SetAllVariablesForNewRound;

public class CollisionWithOrangeMonsterInScatterMode extends TheLastLife {
    public CollisionWithOrangeMonsterInScatterMode()
    {
        boolean collided = false;

        if(Math.abs(orangeGhostX-arcX)<=2  && orangeGhostY==arcY) collided = true;
        if(Math.abs(orangeGhostY-arcY)<=2 && orangeGhostX==arcX) collided = true;

        if(collided)
        {
            SetAllVariablesForNewRound setAllVariablesForNewRound = new SetAllVariablesForNewRound();
        }
    }
}

