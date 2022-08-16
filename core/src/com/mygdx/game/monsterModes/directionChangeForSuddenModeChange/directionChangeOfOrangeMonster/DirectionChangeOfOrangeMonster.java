package com.mygdx.game.monsterModes.directionChangeForSuddenModeChange.directionChangeOfOrangeMonster;

import com.mygdx.game.TheLastLife;

public class DirectionChangeOfOrangeMonster extends TheLastLife {
    public DirectionChangeOfOrangeMonster()
    {
        if(orangeRight)
        {
            orangeLeft = true;
            orangeRight = false;
           // orangeGhostX -= orangeGhostMove;
            isOrangeRightPngFri = false;
            isOrangeLeftPngFri = true;
            isOrangeRightPng = false;
            isOrangeLeftPng = true;
            isOrangeRightPngEaten = false;
            isOrangeLeftPngEaten = true;


        }
        else if(orangeLeft)
        {
            orangeLeft = false;
            orangeRight = true;
            //orangeGhostX += orangeGhostMove;
            isOrangeRightPng = true;
            isOrangeLeftPng = false;
            isOrangeRightPngFri = true;
            isOrangeLeftPngFri = false;
            isOrangeRightPngEaten = true;
            isOrangeLeftPngEaten = false;
        }
        else if(orangeUp)
        {
            orangeUp = false;
            orangeDown = true;
       //     orangeGhostY -= orangeGhostMove;
        }
        else
        {
            orangeDown = false;
            orangeUp = true;
         //   orangeGhostY += orangeGhostMove;
        }
    }
}
