package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn;

import com.badlogic.gdx.math.Interpolation;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonserGoingCenter.CyanMonsterGoingCenter;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterGoingOut.CyanMonsterGoingOut;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.CyanMonsterMovementBasedOnModes;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterGoingOut.PinkMonsterGoingOut;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.PinkMonsterMovementBasedOnModes;

public class CyanMonsterMovementOn extends TheLastLife {
    public CyanMonsterMovementOn()
    {
        if(cyanGhostCenterOfGhostHouse==false)
        {
            cyanLeft = true; // actually this is based on ghosthouseout left turn
            cyanGhostMovementOn = true;
            CyanMonsterGoingCenter cyanMonsterGoingCenter = new CyanMonsterGoingCenter();
        }
        else if(cyanGhostOutOfGhostHouse==false) {
            CyanMonsterGoingOut cyanMonsterGoingOut = new CyanMonsterGoingOut();
        }
        else {
           // System.out.println("bahire aisi");
            CyanMonsterMovementBasedOnModes cyanMonsterMovementBasedOnModes = new CyanMonsterMovementBasedOnModes();
        }
    }
}
