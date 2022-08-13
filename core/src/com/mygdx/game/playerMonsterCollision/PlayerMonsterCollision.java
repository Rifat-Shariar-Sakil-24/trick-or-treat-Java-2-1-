package com.mygdx.game.playerMonsterCollision;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.playerMonsterCollision.collisionWIthRedMonster.CollisionWithRedMonster;
import com.mygdx.game.playerMonsterCollision.collisionWithCyanMonster.CollisionWithCyanMonster;
import com.mygdx.game.playerMonsterCollision.collisionWithOrangeMonster.CollisionWithOrangeMonster;
import com.mygdx.game.playerMonsterCollision.collsionWIthPinkMonster.CollisionWIthPinkMonster;

public class PlayerMonsterCollision extends TheLastLife {
    public PlayerMonsterCollision()
    {
        CollisionWithRedMonster collisionWithRedMonster = new CollisionWithRedMonster();
        CollisionWIthPinkMonster collisionWIthPinkMonster = new CollisionWIthPinkMonster();
        CollisionWithCyanMonster collisionWithCyanMonster = new CollisionWithCyanMonster();
        CollisionWithOrangeMonster collisionWithOrangeMonster = new CollisionWithOrangeMonster();
    }
}
