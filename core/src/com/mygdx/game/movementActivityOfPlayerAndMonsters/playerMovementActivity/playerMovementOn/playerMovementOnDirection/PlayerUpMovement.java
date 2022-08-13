package com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.player.PlayerDraw;

public class PlayerUpMovement extends TheLastLife {
    public PlayerUpMovement(){
        arcY = Math.min(arcY,arcYMax);

        boolean valid = true;
        if(arcY%cellHeight==0 && arcX%cellWidth==0)
        {
            int x = (int) (arcX/cellWidth);
            int y = (int) (arcY/cellHeight);
            if(noteEatenCoins[x][y]==1) {score+=perCoinScore;numberOfCoins--;}
            if(noteEatenCoins[x][y]==1 && coinForFrightenedMode[x][y]==1)
            {
                if(redGhostEatenMode==false)
                {
                    redGhostFrightenedModeOn = true;
                    redGhostChaseModeOn = false;
                    redGhostScatterModeOn = false;
                }

                if(pinkGhostEatenMode==false)
                {
                    pinkGhostFrightenedModeOn = true;
                    pinkGhostChaseModeOn = false;
                    pinkGhostScatterModeOn = false;
                }
                if(cyanGhostEatenMode==false)
                {
                    cyanGhostFrightenedModeOn = true;
                    cyanGhostChaseModeOn = false;
                    cyanGhostScatterModeOn = false;
                }
                if(orangeGhostEatenMode==false)
                {
                    orangeGhostFrightenedModeOn = true;
                    orangeGhostChaseModeOn = false;
                    orangeGhostScatterModeOn = false;
                }
                timeDurationOfGhostFrightenedModePinkMonster = 0;
                timeDurationOfGhostFrightenedModeRedMonster = 0;
                timeDurationOfGhostFrightenedModeCyanMonster = 0;
                timeDurationOfGhostFrightenedModeOrangeMonster = 0;

                score += perCoinScore;


            }
            noteEatenCoins[x][y] = 0;
            coinForFrightenedMode[x][y] = 0;
            if(arcDirection=='d' && (coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1))
            {
                arcRight=arcLeft=arcUp=arcDown=false;
                arcRight=true;
            }
            else if(arcDirection=='a' && (coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1)) {
                arcRight = arcLeft = arcUp = arcDown = false;
                arcLeft = true;
            }
            if(coins[x][y+1]==0  && noCoinLegalPoints[x][y+1]==0) valid=false;
        }
       // shapeRenderer.arc(arcX,arcY,arcRadius,135,270);
        PlayerDraw playerDraw = new PlayerDraw();
        if(arcY!=arcYMax &&arcUp && valid)arcY += arcMove;

    }
}
