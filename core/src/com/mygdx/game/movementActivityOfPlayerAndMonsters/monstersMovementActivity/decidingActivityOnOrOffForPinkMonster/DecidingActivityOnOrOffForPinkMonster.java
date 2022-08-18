package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOff.PinkMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.PinkMonsterMovementOn;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOff.RedMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.RedMonsterMovementOn;

public class DecidingActivityOnOrOffForPinkMonster extends TheLastLife {
    public DecidingActivityOnOrOffForPinkMonster()
    {
        if(timeElapsedForPauseToMovementPinkMonster<=2){
            PinkMonsterMovementOff pinkMonsterMovementOff = new PinkMonsterMovementOff();
        }
        else{
            PinkMonsterMovementOn pinkMonsterMovementOn = new PinkMonsterMovementOn();
        }
    }
}
