package com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForPinkMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfPinkMonster.DirectionChangeOfPinkMonster;

public class DecidingModesForPinkMonster extends TheLastLife {
    public DecidingModesForPinkMonster()
    {
        if(pinkGhostEatenMode==false && pinkGhostFrightenedModeOn==false) { decideChaseOrScatter();}
        else if(pinkGhostFrightenedModeOn) {decideFrightened();}
        else decideEaten();
    }

    private void decideChaseOrScatter() {
        long nowTime = timeElapsedForModeChangePinkMonster;
        nowTime %= modeChangeTimeInterval;
        if(nowTime>=0 && nowTime<=4)
        {
            pinkGhostScatterModeOn = true;
            if(pinkGhostChaseModeOn)
            {
                DirectionChangeOfPinkMonster directionChangeOfPinkMonster = new DirectionChangeOfPinkMonster();
            }
            pinkGhostChaseModeOn =false;
        }
        else
        {
            pinkGhostChaseModeOn = true;
            if(pinkGhostScatterModeOn)
            {
                DirectionChangeOfPinkMonster directionChangeOfPinkMonster = new DirectionChangeOfPinkMonster();

            }
            pinkGhostScatterModeOn = false;
        }
    }
    private void decideFrightened(){
        if(timeDurationOfGhostFrightenedModePinkMonster<=8)
        {
            if(directionChangedOnFrightenedModePink==false)
            {
                DirectionChangeOfPinkMonster directionChangeOfPinkMonster = new DirectionChangeOfPinkMonster();
                directionChangedOnFrightenedModePink = true;;
            }
        }
        else {
            pinkGhostChaseModeOn=true;pinkGhostScatterModeOn=true;timeDurationOfGhostFrightenedModePinkMonster=0;
            pinkGhostFrightenedModeOn = false;
            directionChangedOnFrightenedModePink = false;
        }
    }
    private void decideEaten()
    {
        if(pinkGhostX==pinkGhostXInitial && pinkGhostY==pinkGhostYInitial)
        {
            pinkGhostEatenMode = false;
            pinkGhostFrightenedModeOn = false;
            pinkGhostMove = pinkGhostMoveInitial;
            pinkGhostSpeedIncreasedAfterEaten = false;
            pinkGhostOutOfGhostHouse = false;
        }
        else {
            if(isDirectionChangedOnEatenModePink == false)
            {
                isDirectionChangedOnEatenModePink = true;
                DirectionChangeOfPinkMonster directionChangeOfPinkMonster = new DirectionChangeOfPinkMonster();
            }
        }
    }
}
