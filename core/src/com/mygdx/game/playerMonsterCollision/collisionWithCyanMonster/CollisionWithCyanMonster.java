package com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInChaseMode.CollisionWIthCyanMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInFrightenedMode.CollisionWIthCyanMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInScatterMode.CollisionWIthCyanMonsterInScatterMode;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInChaseMode.CollisionWithPinkMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWIthPinkMonsterInFrightenedMode.CollisionWithPinkMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.collisionWithPinkMonsterInScatterMode.CollisionWithPinkMonsterInScatterMode;

public class CollisionWithCyanMonster extends TheLastLife {
    public CollisionWithCyanMonster()
    {
        if(cyanGhostChaseModeOn){
            CollisionWIthCyanMonsterInChaseMode collisionWIthCyanMonsterInChaseMode = new CollisionWIthCyanMonsterInChaseMode();
        }
        else if(cyanGhostScatterModeOn){
            CollisionWIthCyanMonsterInScatterMode  collisionWIthCyanMonsterInScatterMode = new CollisionWIthCyanMonsterInScatterMode();
        }
        else if(cyanGhostFrightenedModeOn){
            CollisionWIthCyanMonsterInFrightenedMode collisionWIthCyanMonsterInFrightenedMode = new CollisionWIthCyanMonsterInFrightenedMode();
        }
    }
}
