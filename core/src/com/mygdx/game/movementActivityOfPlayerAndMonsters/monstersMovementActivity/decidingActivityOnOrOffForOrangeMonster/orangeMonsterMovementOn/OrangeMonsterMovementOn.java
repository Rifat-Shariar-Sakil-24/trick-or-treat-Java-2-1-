package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonserGoingCenter.CyanMonsterGoingCenter;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterGoingOut.CyanMonsterGoingOut;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.CyanMonsterMovementBasedOnModes;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterGoingCenter.OrangeMonsterGoingCenter;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterGoingOut.OrangeMonsterGoingOut;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.OrangeMonsterMovementBasedOnModes;

public class OrangeMonsterMovementOn extends TheLastLife {
    public OrangeMonsterMovementOn()
    {
        if(orangeGhostCenterOfGhostHouse==false)
        {
            orangeLeft = true; // actually this is based on ghosthouseout left turn
            orangeGhostMovementOn = true;
            OrangeMonsterGoingCenter cyanMonsterGoingCenter = new OrangeMonsterGoingCenter();
        }
        else if(orangeGhostOutOfGhostHouse==false) {
            OrangeMonsterGoingOut orangeMonsterGoingOut = new OrangeMonsterGoingOut();
        }
        else {
            // System.out.println("bahire aisi");
            //CyanMonsterMovementBasedOnModes cyanMonsterMovementBasedOnModes = new CyanMonsterMovementBasedOnModes();
            OrangeMonsterMovementBasedOnModes orangeMonsterMovementBasedOnModes = new OrangeMonsterMovementBasedOnModes();
        }
    }
}
