package com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfPinkMonster;

import com.mygdx.game.TheLastLife;

public class DirectionChangeOfPinkMonster extends TheLastLife {
    public DirectionChangeOfPinkMonster()
    {
        if(pinkRight)
        {
            pinkLeft = true;
            pinkRight = false;
            pinkGhostX -= pinkGhostMove;
            isPinkRightPng = false;
            isPinkLeftPng=true;
            isPinkRightPngFri = false;
            isPinkLeftPngFri = true;
            isPinkRightPngEaten = false;
            isPinkLeftPngEaten=true;
        }
        else if(pinkLeft)
        {
            pinkLeft = false;
            pinkRight = true;
            pinkGhostX += pinkGhostMove;
            isPinkRightPng = true;
            isPinkLeftPng = false;
            isPinkRightPngFri = true;
            isPinkLeftPngFri = false;
            isPinkRightPngEaten= true;
            isPinkLeftPngEaten = false;
        }
        else if(pinkUp)
        {
            pinkUp = false;
            pinkDown = true;
            pinkGhostY -= pinkGhostMove;
        }
        else
        {
            pinkDown = false;
            pinkUp = true;
            pinkGhostY += pinkGhostMove;
        }
    }
}
