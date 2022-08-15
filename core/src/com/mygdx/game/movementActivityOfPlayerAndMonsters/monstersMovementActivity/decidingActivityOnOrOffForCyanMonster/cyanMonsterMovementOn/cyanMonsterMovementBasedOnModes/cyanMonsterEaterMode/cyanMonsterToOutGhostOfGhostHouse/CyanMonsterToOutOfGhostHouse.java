package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterEaterMode.cyanMonsterToOutGhostOfGhostHouse;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanEatenDrawing.CyanDrawEaten;

public class CyanMonsterToOutOfGhostHouse extends TheLastLife {
    public CyanMonsterToOutOfGhostHouse()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.circle(cyanGhostX, cyanGhostY, cyanGhostRadius);
        shapeRenderer.end();*/

        CyanDrawEaten cyanDrawEaten = new CyanDrawEaten();

        if (cyanGhostMovementOn == false  && (cyanGhostX % cellWidth!=0 && cyanGhostY % cellHeight!=0)) {


            if(cyanUp) cyanGhostY += cyanGhostMove;
           else if(cyanDown) cyanGhostY -= cyanGhostMove;



            else if(cyanRight) {
                if(cyanGhostX >= 1044+cyanGhostRadius){
                    cyanGhostX = -cyanGhostRadius;
                }
                cyanGhostX += cyanGhostMove;

            }
            else if(cyanLeft) {
                if(cyanGhostX<=-cyanGhostRadius){
                    cyanGhostX = 1044+cyanGhostRadius;
                }
                cyanGhostX-=cyanGhostMove;
            }
        }
        else
        {

            if (cyanGhostX % cellWidth == 0 && cyanGhostY % cellHeight == 0)
            {
                cyanGhostMovementOn = true;
                if(cyanGhostSpeedIncreasedAfterEaten==false){
                    cyanGhostSpeedIncreasedAfterEaten = true;
                    cyanGhostMove = increasedPinkGhostSpeedAtEatenMode;
                }
                cyanAlgorithm();
            }

            else
            {
                if (cyanGhostX >= 1044 + cyanGhostRadius) {
                    cyanGhostX = -(2*cyanGhostMove);
                } else if (cyanGhostX <= -cyanGhostRadius) {
                    cyanGhostX = 1044 + (2*cyanGhostMove);
                } else if (cyanRight) cyanGhostX += cyanGhostMove;
                else if (cyanLeft) cyanGhostX -= cyanGhostMove;
                else if (cyanUp) cyanGhostY += cyanGhostMove;
                else cyanGhostY -= cyanGhostMove;
            }

        }
    }

    private void cyanAlgorithm() {
        boolean On = false;

        if (cyanGhostY / cellHeight == 17 && cyanGhostX / cellWidth >= 27) {
            cyanRightException();
            On = true;
        }
        else if (cyanGhostY / cellHeight == 17 && cyanGhostX / cellWidth <= 2) {
            cyanLeftException();
            On = true;
        }

        if(On == false)
        {
            int x = (int) (cyanGhostX/cellWidth);
            int y = (int) (cyanGhostY/cellHeight);



            int ind=1;
            float distanceXY = Float.MAX_VALUE;

            if((coins[x + 1][y] == 1 || noCoinLegalPoints[x + 1][y] == 1) && !cyanLeft)
            {
                float X = (cyanGhostX+cyanGhostMove-redGhostXInitial)* (cyanGhostX+cyanGhostMove-redGhostXInitial);
                float Y = (cyanGhostY-redGhostYInitial) * (cyanGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !cyanRight)
            {
                float X = (cyanGhostX-cyanGhostMove-redGhostXInitial)* (cyanGhostX-cyanGhostMove-redGhostXInitial);
                float Y = (cyanGhostY-redGhostYInitial) * (cyanGhostY-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1] == 1 || noCoinLegalPoints[x][y+1] == 1) && !cyanDown)
            {
                float X = (cyanGhostX-redGhostXInitial)* (cyanGhostX-redGhostXInitial);
                float Y = (cyanGhostY+cyanGhostMove-redGhostYInitial) * (cyanGhostY+cyanGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1] == 1 || noCoinLegalPoints[x][y-1] == 1) && !cyanUp)
            {
                float X = (cyanGhostX-redGhostXInitial) * (cyanGhostX-redGhostXInitial);
                float Y = (cyanGhostY-cyanGhostMove-redGhostYInitial) * (cyanGhostY-cyanGhostMove-redGhostYInitial);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 4;
                    distanceXY = distanceXYTrial;
                }

            }

            if(ind==1)
            {
                cyanGhostX += cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanRight=true;
                isCyanRightPngEaten = true;
                isCyanLeftPngEaten = false;
            }
            else if(ind==2)
            {
                cyanGhostX -= cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanLeft=true;
                isCyanRightPngEaten = false;
                isCyanLeftPngEaten = true;
            }
            else if(ind==3)
            {
                cyanGhostY += cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanUp=true;
            }
            else
            {
                cyanGhostY -= cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanDown=true;
            }
        }
    }


    private void cyanRightException() {
        if(cyanRight) {
            if(cyanGhostX >= 1044+cyanGhostRadius){
                cyanGhostX = -cyanGhostRadius;
            }
            cyanGhostX += cyanGhostMove;

        }
        else if(cyanLeft) {
            cyanGhostX-=cyanGhostMove;
        }
    }
    private void cyanLeftException() {
        if(cyanRight) {
            cyanGhostX += cyanGhostMove;
        }
        else if(cyanLeft) {
            if(cyanGhostX<=-cyanGhostRadius){
                cyanGhostX = 1044+cyanGhostRadius;
            }
            cyanGhostX-=cyanGhostMove;
        }
    }

}
