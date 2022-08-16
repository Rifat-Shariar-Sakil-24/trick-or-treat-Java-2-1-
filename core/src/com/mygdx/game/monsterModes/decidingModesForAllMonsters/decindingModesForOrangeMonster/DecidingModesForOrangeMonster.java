package com.mygdx.game.monsterModes.decidingModesForAllMonsters.decindingModesForOrangeMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfCyanMonster.DirectionChangeOfCyanMonster;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfOrangeMonster.DirectionChangeOfOrangeMonster;

public class DecidingModesForOrangeMonster extends TheLastLife {
    public DecidingModesForOrangeMonster()
    {
        if(orangeGhostEatenMode==false && orangeGhostFrightenedModeOn==false) { decideChaseOrScatter();}
        else if(orangeGhostFrightenedModeOn) {decideFrightened();}
        else decideEaten();
    }

    private void decideChaseOrScatter() {
        long nowTime = timeElapsedForModeChangeOrangeMonster;
        nowTime %= modeChangeTimeInterval;
        if(nowTime>=0 && nowTime<=4)
        {
            orangeGhostScatterModeOn = true;
            if(orangeGhostChaseModeOn)
            {
                DirectionChangeOfOrangeMonster directionChangeOfOrangeMonster = new DirectionChangeOfOrangeMonster();
            }
            orangeGhostChaseModeOn =false;
        }
        else
        {
            orangeGhostChaseModeOn = true;
            if(orangeGhostScatterModeOn)
            {
                DirectionChangeOfOrangeMonster directionChangeOfOrangeMonster = new DirectionChangeOfOrangeMonster();

            }
            orangeGhostScatterModeOn = false;
        }
    }
    private void decideFrightened(){
        if(timeDurationOfGhostFrightenedModeOrangeMonster<=8)
        {
            if(directionChangedOnFrightenedModeOrange==false)
            {
                DirectionChangeOfOrangeMonster directionChangeOfOrangeMonster = new DirectionChangeOfOrangeMonster();
                directionChangedOnFrightenedModeOrange = true;;
            }
        }
        else {
            orangeGhostChaseModeOn=true;orangeGhostScatterModeOn=true;timeDurationOfGhostFrightenedModeOrangeMonster=0;
            orangeGhostFrightenedModeOn = false;
            directionChangedOnFrightenedModeOrange = false;
        }
    }
    private void decideEaten()
    {
        if(orangeGhostX==orangeGhostXInitial && orangeGhostY==orangeGhostYInitial)
        {
            orangeGhostEatenMode = false;
            orangeGhostFrightenedModeOn = false;
            orangeGhostMove = pinkGhostMoveInitial;
            orangeGhostSpeedIncreasedAfterEaten = false;
            orangeGhostOutOfGhostHouse = false;
            orangeGhostCenterOfGhostHouse = false;


            directionChangedOnFrightenedModeOrange = false;
            isDirectionChangedOnEatenModeOrange = false;

            orangeGhostReachedCenterOfGhostHouseEatenMode = false;
            orangeGhostReachedOutOfGhostHouseEatenMode = false;
        }
        else {
            if(isDirectionChangedOnEatenModeOrange == false)
            {
                isDirectionChangedOnEatenModeOrange = true;
                DirectionChangeOfOrangeMonster directionChangeOfOrangeMonster = new DirectionChangeOfOrangeMonster();

            }
        }
    }
}
