package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterChaseMode.PinkMonsterChaseMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.PinkMonsterEatenMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterFrightenedMode.PinkMonsterFrightenedMode;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterScatterMode.PinkMonsterScatterMode;

public class PinkMonsterMovementBasedOnModes extends TheLastLife {
    public PinkMonsterMovementBasedOnModes() {
       // System.out.println("pink   "+pinkGhostEatenMode+pinkGhostChaseModeOn+pinkGhostFrightenedModeOn+pinkGhostScatterModeOn);
        if (pinkGhostChaseModeOn) {PinkMonsterChaseMode pinkMonsterChaseMode = new PinkMonsterChaseMode();}
        else if (pinkGhostScatterModeOn) {PinkMonsterScatterMode pinkMonsterScatterMode = new PinkMonsterScatterMode();}
        else if (pinkGhostFrightenedModeOn) {PinkMonsterFrightenedMode pinkMonsterFrightenedMode = new PinkMonsterFrightenedMode();}
        else if (pinkGhostEatenMode) {PinkMonsterEatenMode pinkMonsterEatenMode = new PinkMonsterEatenMode();}

    }
}
