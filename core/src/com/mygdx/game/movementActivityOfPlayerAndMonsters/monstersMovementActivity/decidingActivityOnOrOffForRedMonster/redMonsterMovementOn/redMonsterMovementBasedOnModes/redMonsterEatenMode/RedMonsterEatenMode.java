package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterEatenMode;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.redMonster.redEatenDrawing.RedDrawEaten;

import java.util.ArrayList;
import java.util.Random;

public class RedMonsterEatenMode extends TheLastLife {
    public RedMonsterEatenMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(redGhostX,redGhostY,redGhostRadius);
        shapeRenderer.end();*/
        RedDrawEaten redDrawEaten = new RedDrawEaten();



        if(redGhostMovementOn==false) {redGhostX += redGhostMove;redGhostMovementOn=true;redRight=true;}
        else{

            if(redGhostX%cellWidth==0 && redGhostY%cellHeight==0)
            {
                if(redGhostSpeedIncreasedAfterEaten==false){
                    redGhostSpeedIncreasedAfterEaten = true;
                    redGhostMove = increasedRedGhostSpeedAtEatenMode;
                }
                redAlgorithm();
            }
            else
            {
                if(redGhostX>=1044+redGhostRadius)
                {
                    redGhostX = -redGhostRadius+redGhostMove;
                }
                else if(redGhostX<=-redGhostRadius)
                {
                    redGhostX = 1044+redGhostRadius-redGhostMove;
                }
                else if(redRight) redGhostX+=redGhostMove;
                else if(redLeft) redGhostX-=redGhostMove;
                else if(redUp) redGhostY+=redGhostMove;
                else redGhostY-=redGhostMove;
            }

        }

    }


    private void redAlgorithm() {

        boolean On = false;

        if(redGhostY/cellHeight==17 && redGhostX/cellWidth>=27)
        {
            redRightException();
            On=true;
        }


        else if(redGhostY/cellHeight==17 && redGhostX/cellWidth<=2)
        {
            redLeftException();
            On = true;
        }

        if(On==false)
        {

            float redXNow,redYNow;
            int x = (int) (redGhostX/cellWidth);
            int y = (int) (redGhostY/cellHeight);

            int ind=1;
            float distanceXY = Float.MAX_VALUE;
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1)  && !redLeft)
            {
                float X = (redGhostX+redGhostMove-redGhostXInitial)* (redGhostX+redGhostMove-redGhostXInitial);
                float Y = (redGhostY-redGhostYInitial) * (redGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !redRight)
            {
                float X = (redGhostX-redGhostMove-redGhostXInitial)* (redGhostX-redGhostMove-redGhostXInitial);
                float Y = (redGhostY-redGhostYInitial) * (redGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1) && !redDown)
            {
                float X = (redGhostX-redGhostXInitial)* (redGhostX-redGhostXInitial);
                float Y = (redGhostY+redGhostMove-redGhostYInitial) * (redGhostY+redGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1)&& !redUp)
            {
                float X = (redGhostX-redGhostXInitial) * (redGhostX-redGhostXInitial);
                float Y = (redGhostY-redGhostMove-redGhostYInitial) * (redGhostY-redGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 4;
                    distanceXY = distanceXYTrial;
                }

            }

            if(ind==1)
            {
                redGhostX += redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redRight=true;
                isRedRightPngEaten = true;
                isRedLeftPngEaten = false;
            }
            else if(ind==2)
            {
                redGhostX -= redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redLeft=true;
                isRedRightPngEaten = false;
                isRedLeftPngEaten = true;
            }
            else if(ind==3)
            {
                redGhostY += redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redUp=true;
            }
            else
            {
                redGhostY -= redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redDown=true;
            }
        }


    }



    private void redRightException() {

        if(redRight) {
            if(redGhostX >= 1044+redGhostRadius){
                redGhostX = -redGhostRadius;
            }
            redGhostX += redGhostMove;

        }
        else if(redLeft) {
            redGhostX-=redGhostMove;

        }
    }

    private void redLeftException() {

        if(redRight) {
            redGhostX += redGhostMove;

        }
        else if(redLeft) {

            if(redGhostX<=-redGhostRadius){
                redGhostX = 1044+redGhostRadius;
            }
            redGhostX-=redGhostMove;
        }
    }
}