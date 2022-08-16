package com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForCyanMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfCyanMonster.DirectionChangeOfCyanMonster;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfPinkMonster.DirectionChangeOfPinkMonster;

public class DecidingModesForCyanMonster extends TheLastLife {
    public DecidingModesForCyanMonster()
    {
        if(cyanGhostEatenMode==false && cyanGhostFrightenedModeOn==false) { decideChaseOrScatter();}
        else if(cyanGhostFrightenedModeOn) {decideFrightened();}
        else decideEaten();
    }

    private void decideChaseOrScatter() {
        long nowTime = timeElapsedForModeChangeCyanMonster;
        nowTime %= modeChangeTimeInterval;
        if(nowTime>=0 && nowTime<=4)
        {
            cyanGhostScatterModeOn = true;
            if(cyanGhostChaseModeOn)
            {
                DirectionChangeOfCyanMonster directionChangeOfCyanMonster = new DirectionChangeOfCyanMonster();
            }
            cyanGhostChaseModeOn =false;
        }
        else
        {
            cyanGhostChaseModeOn = true;
            if(cyanGhostScatterModeOn)
            {
               DirectionChangeOfCyanMonster directionChangeOfCyanMonster = new DirectionChangeOfCyanMonster();

            }
            cyanGhostScatterModeOn = false;
        }
    }
    private void decideFrightened(){
        if(timeDurationOfGhostFrightenedModeCyanMonster<=8)
        {
            if(directionChangedOnFrightenedModeCyan==false)
            {
                DirectionChangeOfCyanMonster directionChangeOfCyanMonster = new DirectionChangeOfCyanMonster();
                directionChangedOnFrightenedModeCyan = true;;
            }
        }
        else {
            cyanGhostChaseModeOn=true;cyanGhostScatterModeOn=true;timeDurationOfGhostFrightenedModeCyanMonster=0;
            cyanGhostFrightenedModeOn = false;
            directionChangedOnFrightenedModeCyan = false;
        }
    }
    private void decideEaten()
    {
        if(cyanGhostX==cyanGhostXInitial && cyanGhostY==cyanGhostYInitial)
        {
            System.out.print(isDirectionChangedOnEatenModeCyan);
            cyanGhostEatenMode = false;
            cyanGhostFrightenedModeOn = false;
            cyanGhostMove = pinkGhostMoveInitial;
            cyanGhostSpeedIncreasedAfterEaten = false;
            cyanGhostOutOfGhostHouse = false;
            cyanGhostCenterOfGhostHouse = false;


            directionChangedOnFrightenedModeCyan = false;
            isDirectionChangedOnEatenModeCyan = false;


            cyanGhostReachedOutOfGhostHouseEatenMode = false;
            cyanGhostReachedCenterOfGhostHouseEatenMode = false;

          //  System.out.println("  " + isDirectionChangedOnEatenModeCyan);

        }
        else {
            if(isDirectionChangedOnEatenModeCyan == false)
            {
                //System.out.println("ashche: "+ "right: " + cyanRight + "left: " + cyanLeft + "up: "+cyanUp+ "down: " + cyanDown);
                isDirectionChangedOnEatenModeCyan = true;
                DirectionChangeOfCyanMonster directionChangeOfCyanMonster = new DirectionChangeOfCyanMonster();

            }
        }
    }
}
