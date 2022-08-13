package com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForRedMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfRedMonster.DirectionChangeOfRedMonster;

public class DecidingModesForRedMonster extends TheLastLife {
    public DecidingModesForRedMonster()
    {
        if(redGhostEatenMode==false && redGhostFrightenedModeOn==false) { decideChaseOrScatter();}
        else if(redGhostFrightenedModeOn) {decideFrightened();}
        else decideEaten();
    }

    private void decideChaseOrScatter() {
        long nowTime = timeElapsedForModeChangeRedMonster;
        nowTime %= modeChangeTimeInterval;
        if(nowTime>=0 && nowTime<=4)
        {
            redGhostScatterModeOn = true;
            if(redGhostChaseModeOn)
            {
                DirectionChangeOfRedMonster directionChangeOfRedMonster = new DirectionChangeOfRedMonster();
            }
            redGhostChaseModeOn =false;
        }
        else
        {
            redGhostChaseModeOn = true;
            if(redGhostScatterModeOn)
            {
                DirectionChangeOfRedMonster directionChangeOfRedMonster = new DirectionChangeOfRedMonster();
            }
            redGhostScatterModeOn = false;
        }
    }
    private void decideFrightened(){
        if(timeDurationOfGhostFrightenedModeRedMonster<=8)
        {
            if(directionChangedOnFrightenedModeRed==false)
            {
                DirectionChangeOfRedMonster directionChangeOfRedMonster = new DirectionChangeOfRedMonster();
                directionChangedOnFrightenedModeRed = true;

            }
        }
        else {
            redGhostChaseModeOn=true;redGhostScatterModeOn=true;timeDurationOfGhostFrightenedModeRedMonster=0;
            redGhostFrightenedModeOn = false;
            directionChangedOnFrightenedModeRed = false;
        }
    }
    private void decideEaten()
    {
        if(redGhostX==redGhostXInitial && redGhostY==redGhostYInitial)
        {
            redGhostEatenMode = false;
            redGhostFrightenedModeOn = false;
            redGhostMove = redGhostMoveInitial;
            redGhostSpeedIncreasedAfterEaten = false;
        }
        else {
            if(isDirectionChangedOnEatenModeRed == false)
            {
                isDirectionChangedOnEatenModeRed = true;
                DirectionChangeOfRedMonster directionChangeOfRedMonster = new DirectionChangeOfRedMonster();
            }
        }
    }
}
