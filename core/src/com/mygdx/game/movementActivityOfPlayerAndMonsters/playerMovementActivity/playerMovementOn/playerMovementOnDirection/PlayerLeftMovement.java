package com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.player.PlayerDraw;

public class PlayerLeftMovement extends TheLastLife {
    public PlayerLeftMovement(){

        if(arcX%cellWidth==0 && arcY%cellHeight==0)
        {


                isPlayerLeftPng = true;
                isPlayerDownPng = false;
                isPlayerUpPng = false;
                isPlayerRightPng = false;


        }

        boolean On = false;

        if(arcY%cellHeight==0 && arcY/cellHeight==17 && arcX/cellWidth>=27)
        {



            if(arcRight) {

             //   shapeRenderer.arc(arcX,arcY,arcRadius,45,270);
                PlayerDraw playerDraw = new PlayerDraw();
                if(arcX >= 1044+arcRadius){
                    arcX = -arcRadius;
                }
                arcX += arcMove;
                On = true;
            }
            else if(arcLeft) {

               // shapeRenderer.arc(arcX,arcY,arcRadius,-135,270);
                PlayerDraw playerDraw = new PlayerDraw();
                arcX-=arcMove;
                On = true;
            }

        }


        else if(arcY%cellHeight==0 && arcY/cellHeight==17 && arcX/cellWidth<=2)
        {

            if(arcRight) {
                //shapeRenderer.arc(arcX,arcY,arcRadius,45,270);
                PlayerDraw playerDraw = new PlayerDraw();
                arcX += arcMove;
                On = true;
            }
            else if(arcLeft) {

                //shapeRenderer.arc(arcX,arcY,arcRadius,-135,270);
                PlayerDraw playerDraw = new PlayerDraw();
                if(arcX<=-arcRadius){
                    arcX = 1044+arcRadius;
                }
                arcX-=arcMove;
                On = true;
            }

        }

        if(On==false)
        {
            arcX = Math.max(arcX,arcXMin);
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

                if(arcDirection=='w' && (coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1))
                {
                    arcRight=arcLeft=arcUp=arcDown=false;
                    arcUp=true;
                }
                else if(arcDirection=='s' && (coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1))
                {
                    arcRight=arcLeft=arcUp=arcDown=false;
                    arcDown=true;
                }
                if(coins[x-1][y]==0  && noCoinLegalPoints[x-1][y]==0) valid = false;
            }
            //shapeRenderer.arc(arcX,arcY,arcRadius,-135,270);
            PlayerDraw playerDraw = new PlayerDraw();
            if(arcX!=arcXMin && arcLeft && valid)arcX -= arcMove;
        }
    }
}
