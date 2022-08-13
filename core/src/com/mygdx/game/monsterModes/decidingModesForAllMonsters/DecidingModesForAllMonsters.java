package com.mygdx.game.monsterModes.decidingModesForAllMonsters;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForCyanMonster.DecidingModesForCyanMonster;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForPinkMonster.DecidingModesForPinkMonster;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.decidingModesForRedMonster.DecidingModesForRedMonster;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.decindingModesForOrangeMonster.DecidingModesForOrangeMonster;

public class DecidingModesForAllMonsters extends TheLastLife {
    public DecidingModesForAllMonsters()
    {
        DecidingModesForRedMonster decidingModesForRedMonster = new DecidingModesForRedMonster();
        DecidingModesForPinkMonster decidingModesForPinkMonster = new DecidingModesForPinkMonster();
        DecidingModesForCyanMonster decidingModesForCyanMonster = new DecidingModesForCyanMonster();
        DecidingModesForOrangeMonster decidingModesForOrangeMonster = new DecidingModesForOrangeMonster();
    }
}
