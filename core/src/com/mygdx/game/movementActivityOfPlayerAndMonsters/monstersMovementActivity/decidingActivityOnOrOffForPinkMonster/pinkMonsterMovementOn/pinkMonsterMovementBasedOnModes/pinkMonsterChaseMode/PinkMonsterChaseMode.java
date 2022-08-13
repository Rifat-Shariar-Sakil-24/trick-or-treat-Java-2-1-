package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkNormalDrawing.PinkDrawNormal;

public class PinkMonsterChaseMode extends TheLastLife {
    public PinkMonsterChaseMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.PINK);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawNormal pinkDraw = new PinkDrawNormal();

        if(pinkGhostMovementOn==false) {pinkGhostX += pinkGhostMove;pinkGhostMovementOn=true;pinkRight=true;}
        else{

            if(pinkGhostX%cellWidth==0 && pinkGhostY%cellHeight==0)
            {
                pinkAlgorithm();
            }
            else
            {
                if(pinkGhostX>=1044+pinkGhostRadius)
                {
                    pinkGhostX = -pinkGhostRadius+pinkGhostMove;
                }
                else if(pinkGhostX<=-pinkGhostRadius)
                {
                    pinkGhostX = 1044+pinkGhostRadius-pinkGhostMove;
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

        if (pinkGhostY / cellHeight == 17 && pinkGhostX / cellWidth >= 27) {
            pinkRightException();
            On = true;
        } else if (pinkGhostY / cellHeight == 17 && pinkGhostX / cellWidth <= 2) {
            pinkLeftException();
            On = true;
        }

        if (On == false) {

            float redXNow, redYNow;
            int x = (int) (pinkGhostX / cellWidth);
            int y = (int) (pinkGhostY / cellHeight);

            float arcNewX = arcX, arcNewY = arcY;
            if (arcRight) arcNewX += (4 * cellWidth);
            else if (arcLeft) arcNewX -= (4 * cellWidth);
            else if (arcUp) {
                arcNewX -= (4 * cellWidth);
                arcNewY += (4 * cellHeight);
            } else arcNewY -= (4 * cellHeight);

            int ind = 1;
            float distanceXY = Float.MAX_VALUE;

            if ((coins[x + 1][y] == 1 || noCoinLegalPoints[x + 1][y] == 1) && !pinkLeft) {
                float X = (pinkGhostX + pinkGhostMove - arcNewX) * (pinkGhostX + pinkGhostMove - arcNewX);
                float Y = (pinkGhostY - arcNewY) * (pinkGhostY - arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X + Y);
                if (distanceXYTrial < distanceXY) {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if ((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !pinkRight) {
                float X = (pinkGhostX - pinkGhostMove - arcNewX) * (pinkGhostX - pinkGhostMove - arcNewX);
                float Y = (pinkGhostY - arcNewY) * (pinkGhostY - arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X + Y);
                if (distanceXYTrial < distanceXY) {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if ((coins[x][y + 1] == 1 || noCoinLegalPoints[x][y + 1] == 1) && !pinkDown) {
                float X = (pinkGhostX - arcNewX) * (pinkGhostX - arcNewX);
                float Y = (pinkGhostY + pinkGhostMove - arcNewY) * (pinkGhostY + pinkGhostMove - arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X + Y);
                if (distanceXYTrial < distanceXY) {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if ((coins[x][y - 1] == 1 || noCoinLegalPoints[x][y - 1] == 1) && !pinkUp) {
                float X = (pinkGhostX - arcNewX) * (pinkGhostX - arcNewX);
                float Y = (pinkGhostY - pinkGhostMove - arcNewY) * (pinkGhostY - pinkGhostMove - arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X + Y);
                if (distanceXYTrial < distanceXY) {
                    ind = 4;
                    distanceXY = distanceXYTrial;
                }

            }

            if (ind == 1) {
                pinkGhostX += pinkGhostMove;
                pinkRight = pinkLeft = pinkUp = pinkDown = false;
                pinkRight = true;
                isPinkRightPng = true;
                isPinkLeftPng = false;
            } else if (ind == 2) {
                pinkGhostX -= pinkGhostMove;
                pinkRight = pinkLeft = pinkUp = pinkDown = false;
                pinkLeft = true;
                isPinkRightPng = false;
                isPinkLeftPng = true;
            } else if (ind == 3) {
                pinkGhostY += pinkGhostMove;
                pinkRight = pinkLeft = pinkUp = pinkDown = false;
                pinkUp = true;
            } else {
                pinkGhostY -= pinkGhostMove;
                pinkRight = pinkLeft = pinkUp = pinkDown = false;
                pinkDown = true;
            }

        }
    }



    private void pinkRightException(){

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

