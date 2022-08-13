package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForRedMonster.DecidingModesForRedMonster;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.DecidingActivityOnOrOffForCyanMonster;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.DecidingActivityOnOrOffForOrangeMonster;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.DecidingActivityOnOrOffForPinkMonster;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.DecidingActivityOnOrOffForRedMonster;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOff.RedMonsterMovementOff;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.RedMonsterMovementOn;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.DecidingActivityOnOrOffForPlayer;

public class DecidingActivityOnOrOffForMonsters extends TheLastLife {
    public DecidingActivityOnOrOffForMonsters()
    {
        DecidingActivityOnOrOffForRedMonster decidingActivityOnOrOffForRedMonster = new DecidingActivityOnOrOffForRedMonster();
        DecidingActivityOnOrOffForPinkMonster decidingActivityOnOrOffForPinkMonster = new DecidingActivityOnOrOffForPinkMonster();
        DecidingActivityOnOrOffForCyanMonster decidingActivityOnOrOffForCyanMonster = new DecidingActivityOnOrOffForCyanMonster();
        DecidingActivityOnOrOffForOrangeMonster decidingActivityOnOrOffForOrangeMonster = new DecidingActivityOnOrOffForOrangeMonster();
    }
}