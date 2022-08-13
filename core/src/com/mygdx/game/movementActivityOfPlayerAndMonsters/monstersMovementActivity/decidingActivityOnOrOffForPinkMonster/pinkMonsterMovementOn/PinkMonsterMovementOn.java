package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterGoingOut.PinkMonsterGoingOut;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.PinkMonsterMovementBasedOnModes;

public class PinkMonsterMovementOn extends TheLastLife {
    public PinkMonsterMovementOn()
    {

         if(pinkGhostOutOfGhostHouse==false) {
             pinkLeft = true;
             pinkGhostMovementOn = true;
             PinkMonsterGoingOut pinkMonsterGoingOut = new PinkMonsterGoingOut();
         }
         else {
             PinkMonsterMovementBasedOnModes pinkMonsterMovementBasedOnModes = new PinkMonsterMovementBasedOnModes();
         }
    }
}
