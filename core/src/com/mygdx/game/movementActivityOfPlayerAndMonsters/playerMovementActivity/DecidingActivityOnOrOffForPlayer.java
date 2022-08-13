package com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOff.PlayerMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.PlayerMovementOn;

public class DecidingActivityOnOrOffForPlayer extends TheLastLife {
    public DecidingActivityOnOrOffForPlayer()
    {
        if(timeElapsedForPauseToMovementRedMonster<=5){
            PlayerMovementOff playerMovementOff = new PlayerMovementOff();
        }
        else {
            playerMovementOn = true;
            PlayerMovementOn playerMovementON = new PlayerMovementOn();
        }
    }
}
