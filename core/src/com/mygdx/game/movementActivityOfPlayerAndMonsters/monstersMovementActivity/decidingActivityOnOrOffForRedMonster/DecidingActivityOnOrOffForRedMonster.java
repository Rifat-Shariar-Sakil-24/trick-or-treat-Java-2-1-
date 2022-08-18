package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOff.RedMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.RedMonsterMovementOn;

public class DecidingActivityOnOrOffForRedMonster extends TheLastLife {
    public DecidingActivityOnOrOffForRedMonster()
    {
        if(timeElapsedForPauseToMovementRedMonster<=2){
            RedMonsterMovementOff redMonsterMovementOff = new RedMonsterMovementOff();
        }
        else{
            RedMonsterMovementOn redMonsterMovementOn = new RedMonsterMovementOn();
        }
    }
}
