package com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInChaseMode.CollisionWithPinkMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInFrightenedMode.CollisionWithPinkMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWithPinkMonsterInScatterMode.CollisionWithPinkMonsterInScatterMode;

public class CollisionWIthPinkMonster extends TheLastLife {
    public CollisionWIthPinkMonster()
    {
        if(pinkGhostChaseModeOn){
            CollisionWithPinkMonsterInChaseMode collisionWithPinkMonsterInChaseMode = new CollisionWithPinkMonsterInChaseMode();
        }
        else if(pinkGhostScatterModeOn){
            CollisionWithPinkMonsterInScatterMode collisionWithPinkMonsterInScatterMode = new CollisionWithPinkMonsterInScatterMode();
        }
        else if(pinkGhostFrightenedModeOn){
            CollisionWithPinkMonsterInFrightenedMode collisionWithPinkMonsterInFrightenedMode = new CollisionWithPinkMonsterInFrightenedMode();
        }
    }
}
