package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterChaseMode.CyanMonsterChaseMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.CyanMonsterEatenMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterFrightenedMode.CyanMonsterFrightenedMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterScatterMode.CyanMonsterScatterMode;

public class CyanMonsterMovementBasedOnModes extends TheLastLife {
    public CyanMonsterMovementBasedOnModes()
    {
        if(cyanGhostChaseModeOn){ CyanMonsterChaseMode cyanMonsterChaseMode = new CyanMonsterChaseMode();}
        else if(cyanGhostScatterModeOn) {CyanMonsterScatterMode cyanMonsterScatterMode = new CyanMonsterScatterMode();}
        else if(cyanGhostFrightenedModeOn) { CyanMonsterFrightenedMode cyanMonsterFrightenedMode = new CyanMonsterFrightenedMode();}
        else if(cyanGhostEatenMode) { CyanMonsterEatenMode cyanMonsterEatenMode = new CyanMonsterEatenMode();}
    }
}
