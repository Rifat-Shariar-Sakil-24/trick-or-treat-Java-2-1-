package com.mygdx.game.movementActivityOfPlayerAndMonsters;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.DecidingActivityOnOrOffForMonsters;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.DecidingActivityOnOrOffForPlayer;

public class MovementActivityOfPlayerAndMonsters extends TheLastLife {
    public MovementActivityOfPlayerAndMonsters()
    {
        DecidingActivityOnOrOffForPlayer decidingActivityOnOrOffForPlayer = new DecidingActivityOnOrOffForPlayer();
        DecidingActivityOnOrOffForMonsters decidingActivityOnOrOffForMonsters = new DecidingActivityOnOrOffForMonsters();
    }
}
