package com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfRedMonster;

import com.mygdx.game.TheLastLife;

public class DirectionChangeOfRedMonster extends TheLastLife {
    public DirectionChangeOfRedMonster()
    {
        if(redRight)
        {
            redLeft = true;
            redRight = false;
           // redGhostX -= redGhostMove;
            isRedRightPng=false;
            isRedLeftPng=true;
            isRedRightPngFri = false;
            isRedLeftPngFri = true;
            isRedRightPngEaten=false;
            isRedLeftPngEaten=true;


        }
        else if(redLeft)
        {
            redLeft = false;
            redRight = true;
            //redGhostX += redGhostMove;

            isRedRightPng=true;
            isRedLeftPng = false;
            isRedRightPngFri = true;
            isRedLeftPngFri = false;
            isRedRightPngEaten=true;
            isRedLeftPngEaten = false;
        }
        else if(redUp)
        {
            redUp = false;
            redDown = true;
            //redGhostY -= redGhostMove;
        }
        else
        {
            redDown = false;
            redUp = true;
            //redGhostY += redGhostMove;
        }
    }
}
