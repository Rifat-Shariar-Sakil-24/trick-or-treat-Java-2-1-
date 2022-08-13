package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToCenterOfGhostHouse.CyanMonsterToCenterOfGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToInitialPosition.CyanMonsterToInitialPosition;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToOutGhostOfGhostHouse.CyanMonsterToOutOfGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode.orangeMonsterToCenterOfGhostHouse.OrangeMonsterToCenterOfGhostHouse;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode.orangeMonsterToInitialPosition.OrangeMonsterToInitialPosition;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterEatenMode.orangeMonsterToOutOfGhostHouse.OrangeMonsterToOutOfGhostHouse;

public class OrangeMonsterEatenMode extends TheLastLife {
    public OrangeMonsterEatenMode()
    {
        if(orangeGhostX==redGhostXInitial && orangeGhostY == redGhostYInitial) {
            orangeGhostReachedOutOfGhostHouseEatenMode = true;
            if(orangeGhostSpeedIncreasedAfterEaten==false){
                orangeGhostSpeedIncreasedAfterEaten = true;
                orangeGhostMove = increasedOrangeGhostSpeedAtEatenMode;
            }
        }
        if(orangeGhostX == pinkGhostXInitial && orangeGhostY==pinkGhostYInitial)
        {
            orangeGhostReachedCenterOfGhostHouseEatenMode = true;
            isOrangeLeftPngEaten = true;
            isOrangeRightPngEaten = false;
        }

        if(orangeGhostReachedOutOfGhostHouseEatenMode==false)
        {
            OrangeMonsterToOutOfGhostHouse orangeMonsterToOutOfGhostHouse = new OrangeMonsterToOutOfGhostHouse();
        }
        else if(orangeGhostReachedCenterOfGhostHouseEatenMode==false)
        {
            OrangeMonsterToCenterOfGhostHouse orangeMonsterToCenterOfGhostHouse = new OrangeMonsterToCenterOfGhostHouse();
        }
        else
        {
            OrangeMonsterToInitialPosition orangeMonsterToInitialPosition = new OrangeMonsterToInitialPosition();
        }
    }
}
