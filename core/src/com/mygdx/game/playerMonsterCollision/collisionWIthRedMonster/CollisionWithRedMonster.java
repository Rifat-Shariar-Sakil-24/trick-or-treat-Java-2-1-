package com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInChaseMode.CollisionWithRedMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInFrightenedMode.CollisionWithRedMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.collisionWithRedMonsterInScatterMode.CollisionWithRedMonsterInScatterMode;

public class CollisionWithRedMonster extends TheLastLife {
    public CollisionWithRedMonster()
    {
        if(redGhostChaseModeOn){
            CollisionWithRedMonsterInChaseMode  collisionWithRedMonsterInChaseMode = new CollisionWithRedMonsterInChaseMode();
        }
        else if(redGhostScatterModeOn)
        {
            CollisionWithRedMonsterInScatterMode collisionWithRedMonsterInScatterMode = new CollisionWithRedMonsterInScatterMode();
        }
        else if(redGhostFrightenedModeOn){
            CollisionWithRedMonsterInFrightenedMode collisionWithRedMonsterInFrightenedMode = new CollisionWithRedMonsterInFrightenedMode();
        }
    }
}
