package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToCenterOfGhostHouse.CyanMonsterToCenterOfGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToInitialPosition.CyanMonsterToInitialPosition;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToOutGhostOfGhostHouse.CyanMonsterToOutOfGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToInsideGhostHouse.PinkMonsterToInsideGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToOutOfGhostHouse.PinkMonsterToOutOfGhostHouse;

public class CyanMonsterEatenMode extends TheLastLife {
    public CyanMonsterEatenMode()
    {
        if(cyanGhostX==redGhostXInitial && cyanGhostY == redGhostYInitial) {
            cyanGhostReachedOutOfGhostHouseEatenMode = true;
            if(cyanGhostSpeedIncreasedAfterEaten==false){
                cyanGhostSpeedIncreasedAfterEaten = true;
                cyanGhostMove = increasedCyanGhostSpeedAtEatenMode;
            }
        }
        if(cyanGhostX == pinkGhostXInitial && cyanGhostY==pinkGhostYInitial)
        {
            cyanGhostReachedCenterOfGhostHouseEatenMode = true;
            isCyanLeftPngEaten = true;
            isCyanRightPngEaten = false;
        }

        if(cyanGhostReachedOutOfGhostHouseEatenMode==false)
        {
            CyanMonsterToOutOfGhostHouse cyanMonsterToOutOfGhostHouse = new CyanMonsterToOutOfGhostHouse();
        }
        else if(cyanGhostReachedCenterOfGhostHouseEatenMode==false)
        {
            CyanMonsterToCenterOfGhostHouse cyanMonsterToCenterOfGhostHouse = new CyanMonsterToCenterOfGhostHouse();
        }
        else
        {
            CyanMonsterToInitialPosition cyanMonsterToInitialPosition = new CyanMonsterToInitialPosition();
        }
    }
}
