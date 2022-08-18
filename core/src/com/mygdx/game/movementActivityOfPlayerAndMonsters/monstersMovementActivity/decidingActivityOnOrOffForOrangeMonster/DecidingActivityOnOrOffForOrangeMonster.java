package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOff.CyanMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.CyanMonsterMovementOn;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOff.OrangeMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.OrangeMonsterMovementOn;

public class DecidingActivityOnOrOffForOrangeMonster extends TheLastLife {
    public DecidingActivityOnOrOffForOrangeMonster()
    {
        if(timeElapsedForPauseToMovementOrangeMonster<=4){
            OrangeMonsterMovementOff orangeMonsterMovementOff = new OrangeMonsterMovementOff();
        }
        else{
            OrangeMonsterMovementOn orangeMonsterMovementOn = new OrangeMonsterMovementOn();
        }
    }
}
