package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterEatenMode.pinkMonsterToOutOfGhostHouse;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkEatenDrawing.PinkDrawEaten;

public class PinkMonsterToOutOfGhostHouse extends TheLastLife {
    public PinkMonsterToOutOfGhostHouse()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawEaten pinkDrawEaten = new PinkDrawEaten();



        if (pinkGhostMovementOn == false  && (pinkGhostX % cellWidth!=0 || pinkGhostY % cellHeight!=0)) {


            if(pinkUp) pinkGhostY += pinkGhostMove;
            else if(pinkDown)  pinkGhostY -= pinkGhostMove;



            else if(pinkRight) {
                if(pinkGhostX >= 1044+pinkGhostRadius){
                    pinkGhostX = -pinkGhostRadius;
                }
                pinkGhostX += pinkGhostMove;

            }
            else if(pinkLeft) {
                if(pinkGhostX<=-pinkGhostRadius){
                    pinkGhostX = 1044+pinkGhostRadius;
                }
                pinkGhostX-=pinkGhostMove;
            }
        }
        else{

            if(pinkGhostX%cellWidth==0 && pinkGhostY%cellHeight==0)
            {
                pinkGhostMovementOn = true;
                if(pinkGhostSpeedIncreasedAfterEaten==false){
                    pinkGhostSpeedIncreasedAfterEaten = true;
                    pinkGhostMove = increasedPinkGhostSpeedAtEatenMode;
                }
                pinkAlgorithm();
            }
            else
            {
                if(pinkGhostX>=1044+pinkGhostRadius && pinkRight)
                {
                    pinkGhostX = -(2*pinkGhostMove);
                }
                else if(pinkGhostX<=-pinkGhostRadius && pinkLeft)
                {
                    pinkGhostX = 1044+(2*pinkGhostMove);
                }
                else if(pinkRight) pinkGhostX+=pinkGhostMove;
                else if(pinkLeft) pinkGhostX-=pinkGhostMove;
                else if(pinkUp) pinkGhostY+=pinkGhostMove;
                else pinkGhostY-=pinkGhostMove;
            }

        }
    }


    private void pinkAlgorithm() {

        boolean On = false;

        if(pinkGhostY/cellHeight==17 && pinkGhostX/cellWidth>=27)
        {
            pinkRightException();
            On=true;
        }


        else if(pinkGhostY/cellHeight==17 && pinkGhostX/cellWidth<=2)
        {
            pinkLeftException();
            On = true;
        }

        if(On==false)
        {

            float pinkXNow,pinkYNow;
            int x = (int) (pinkGhostX/cellWidth);
            int y = (int) (pinkGhostY/cellHeight);

            int ind=1;
            float distanceXY = Float.MAX_VALUE;
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1)  && !pinkLeft)
            {
                float X = (pinkGhostX+pinkGhostMove-redGhostXInitial)* (pinkGhostX+pinkGhostMove-redGhostXInitial);
                float Y = (pinkGhostY-redGhostYInitial) * (pinkGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !pinkRight)
            {
                float X = (pinkGhostX-pinkGhostMove-redGhostXInitial)* (pinkGhostX-pinkGhostMove-redGhostXInitial);
                float Y = (pinkGhostY-redGhostYInitial) * (pinkGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1) && !pinkDown)
            {
                float X = (pinkGhostX-redGhostXInitial)* (pinkGhostX-redGhostXInitial);
                float Y = (pinkGhostY+pinkGhostMove-redGhostYInitial) * (pinkGhostY+pinkGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1)&& !pinkUp)
            {
                float X = (pinkGhostX-redGhostXInitial) * (pinkGhostX-redGhostXInitial);
                float Y = (pinkGhostY-pinkGhostMove-redGhostYInitial) * (pinkGhostY-pinkGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 4;
                    distanceXY = distanceXYTrial;
                }

            }

            if(ind==1)
            {
                pinkGhostX += pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkRight=true;
                isPinkRightPngEaten = true;
                isPinkLeftPngEaten = false;
            }
            else if(ind==2)
            {
                pinkGhostX -= pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkLeft=true;
                isPinkRightPngEaten = false;
                isPinkLeftPngEaten = true;
            }
            else if(ind==3)
            {
                pinkGhostY += pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkUp=true;
            }
            else
            {
                pinkGhostY -= pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkDown=true;
            }


        }
    }



    private void pinkRightException() {

        if(pinkRight) {
            if(pinkGhostX >= 1044+pinkGhostRadius){
                pinkGhostX = -pinkGhostRadius;
            }
            pinkGhostX += pinkGhostMove;

        }
        else if(pinkLeft) {
            pinkGhostX-=pinkGhostMove;

        }
    }

    private void pinkLeftException() {

        if(pinkRight) {
            pinkGhostX += pinkGhostMove;

        }
        else if(pinkLeft) {

            if(pinkGhostX<=-pinkGhostRadius){
                pinkGhostX = 1044+pinkGhostRadius;
            }
            pinkGhostX-=pinkGhostMove;
        }
    }
}
