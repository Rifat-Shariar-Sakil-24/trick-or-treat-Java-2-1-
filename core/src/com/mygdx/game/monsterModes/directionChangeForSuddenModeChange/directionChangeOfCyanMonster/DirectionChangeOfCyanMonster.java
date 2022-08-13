package com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfCyanMonster;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfPinkMonster.DirectionChangeOfPinkMonster;

public class DirectionChangeOfCyanMonster extends TheLastLife {
    public DirectionChangeOfCyanMonster()
    {
        if(cyanRight)
        {
            cyanLeft = true;
            cyanRight = false;
            cyanGhostX -= cyanGhostMove;
            isCyanRightPngFri = false;
            isCyanLeftPngFri = true;
            isCyanRightPng = false;
            isCyanLeftPng = true;
            isCyanRightPngEaten = false;
            isCyanLeftPngEaten = true;


        }
        else if(cyanLeft)
        {
            cyanLeft = false;
            cyanRight = true;
            cyanGhostX += cyanGhostMove;
            isCyanRightPng = true;
            isCyanLeftPng = false;
            isCyanRightPngFri = true;
            isCyanLeftPngFri = false;
            isCyanRightPngEaten = true;
            isCyanLeftPngEaten = false;
        }
        else if(cyanUp)
        {
            cyanUp = false;
            cyanDown = true;
            cyanGhostY -= cyanGhostMove;
        }
        else
        {
            cyanDown = false;
            cyanUp = true;
            cyanGhostY += cyanGhostMove;
        }
    }
}
