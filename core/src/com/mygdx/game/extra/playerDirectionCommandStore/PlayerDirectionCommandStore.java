package com.mygdx.game.extra.playerDirectionCommandStore;

import com.mygdx.game.TheLastLife;

public class PlayerDirectionCommandStore extends TheLastLife {

    public PlayerDirectionCommandStore(char character)
    {
        if(character==' ')arcMovementOn=true;
        if(character=='d'){
            isPlayerLeftPng =false;
            isPlayerRightPng = true;
            if(arcUp || arcDown) {arcDirection = 'd';}
            else
            {
                arcRight = arcLeft = arcDown = arcUp =  false;
                arcRight = true;
                arcDirection='0';
            }
        }
        if(character == 'a'){
            isPlayerRightPng = false;
            isPlayerLeftPng = true;
            if(arcUp || arcDown) arcDirection = 'a';
            else
            {
                arcRight = arcLeft = arcDown = arcUp =  false;
                arcLeft = true;
                arcDirection='0';
            }
        }
        if(character=='w'){
            if(arcRight || arcLeft) arcDirection = 'w';
            else
            {
                arcRight = arcLeft = arcDown = arcUp =  false;
                arcUp = true;
                arcDirection='0';
            }

        }
        if(character=='s'){
            if(arcRight || arcLeft)arcDirection = 's';
            else
            {
                arcRight = arcLeft = arcDown = arcUp =  false;
                arcDown = true;
                arcDirection='0';
            }

        }

        //System.out.println(arcDirection);
    }
}
