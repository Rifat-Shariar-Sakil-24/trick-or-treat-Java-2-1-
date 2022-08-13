package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOff.CyanMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.CyanMonsterMovementOn;

public class DecidingActivityOnOrOffForCyanMonster extends TheLastLife {
    public DecidingActivityOnOrOffForCyanMonster()
    {
        if(timeElapsedForPauseToMovementCyanMonster<=8){
            CyanMonsterMovementOff cyanMonsterMovementOff = new CyanMonsterMovementOff();
        }
        else{
            CyanMonsterMovementOn cyanMonsterMovementOn = new CyanMonsterMovementOn();
        }
    }
}
