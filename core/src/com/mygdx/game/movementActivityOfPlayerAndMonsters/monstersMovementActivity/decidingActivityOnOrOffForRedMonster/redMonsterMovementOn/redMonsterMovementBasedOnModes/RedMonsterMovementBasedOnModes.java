package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterChaseMode.RedMonsterChaseMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterEatenMode.RedMonsterEatenMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterFrightenedMode.RedMonsterFrightenedMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterScatterMode.RedMonsterScatterMode;

public class RedMonsterMovementBasedOnModes extends TheLastLife {
    public RedMonsterMovementBasedOnModes()
    {
        if(redGhostChaseModeOn){RedMonsterChaseMode redMonsterChaseMode = new RedMonsterChaseMode();}
        else if(redGhostScatterModeOn){RedMonsterScatterMode redMonsterScatterMode = new RedMonsterScatterMode();}
        else if(redGhostFrightenedModeOn) {RedMonsterFrightenedMode redMonsterFrightenedMode = new RedMonsterFrightenedMode();}
        else if(redGhostEatenMode) {RedMonsterEatenMode redMonsterEatenMode = new RedMonsterEatenMode();}
    }
}
