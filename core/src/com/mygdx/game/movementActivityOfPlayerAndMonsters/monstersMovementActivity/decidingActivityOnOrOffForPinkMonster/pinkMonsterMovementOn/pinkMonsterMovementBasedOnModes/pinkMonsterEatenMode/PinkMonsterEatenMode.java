package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToInsideGhostHouse.PinkMonsterToInsideGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToOutOfGhostHouse.PinkMonsterToOutOfGhostHouse;

public class PinkMonsterEatenMode extends TheLastLife {
    public PinkMonsterEatenMode()
    {
        if(pinkGhostX==redGhostXInitial && pinkGhostY == redGhostYInitial) {
            pinkGhostReachedOutOfGhostHouseEatenMode = true;
            if(pinkGhostSpeedIncreasedAfterEaten==false){
                pinkGhostSpeedIncreasedAfterEaten = true;
                pinkGhostMove = increasedPinkGhostSpeedAtEatenMode;
            }
        }

        if(pinkGhostReachedOutOfGhostHouseEatenMode==false)
        {
            PinkMonsterToOutOfGhostHouse pinkMonsterToOutOfGhostHouse = new PinkMonsterToOutOfGhostHouse();
        }
        else
        {
            PinkMonsterToInsideGhostHouse pinkMonsterToInsideGhostHouse = new PinkMonsterToInsideGhostHouse();
        }
    }
}
