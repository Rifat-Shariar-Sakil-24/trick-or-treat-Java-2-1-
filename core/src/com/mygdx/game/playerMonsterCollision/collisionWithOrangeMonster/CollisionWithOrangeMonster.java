package com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInChaseMode.CollisionWIthCyanMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInFrightenedMode.CollisionWIthCyanMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.collisionWIthCyanMonsterInScatterMode.CollisionWIthCyanMonsterInScatterMode;
import com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.collisionWithOrangeMonsterInChaseMode.CollisionWithOrangeMonsterInChaseMode;
import com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.collisionWithOrangeMonsterInFrightenedMode.CollisionWithOrangeMonsterInFrightenedMode;
import com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.collisionWithOrangeMonsterInScatterMode.CollisionWithOrangeMonsterInScatterMode;

public class CollisionWithOrangeMonster extends TheLastLife {
    public CollisionWithOrangeMonster()
    {
        if(orangeGhostChaseModeOn){
            CollisionWithOrangeMonsterInChaseMode collisionWithOrangeMonsterInChaseMode = new CollisionWithOrangeMonsterInChaseMode();
        }
        else if(orangeGhostScatterModeOn){
            CollisionWithOrangeMonsterInScatterMode collisionWithOrangeMonsterInScatterMode = new CollisionWithOrangeMonsterInScatterMode();

        }
        else if(orangeGhostFrightenedModeOn){
            CollisionWithOrangeMonsterInFrightenedMode collisionWithOrangeMonsterInFrightenedMode = new CollisionWithOrangeMonsterInFrightenedMode();
        }
    }
}
