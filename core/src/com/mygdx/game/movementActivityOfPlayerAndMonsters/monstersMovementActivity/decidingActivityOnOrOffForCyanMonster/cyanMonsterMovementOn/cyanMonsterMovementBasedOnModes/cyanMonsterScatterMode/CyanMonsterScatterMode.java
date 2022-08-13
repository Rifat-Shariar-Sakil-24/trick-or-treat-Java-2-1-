package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterScatterMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;

public class CyanMonsterScatterMode extends TheLastLife {
    public CyanMonsterScatterMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.CYAN);
        shapeRenderer.circle(cyanGhostX, cyanGhostY, cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawNormal cyanDraw = new CyanDrawNormal();

        if (cyanGhostMovementOn == false) {
            cyanGhostX += cyanGhostMove;
            cyanGhostMovementOn = true;
            cyanRight = true;
        } else {

            if (cyanGhostX % cellWidth == 0 && cyanGhostY % cellHeight == 0) {
                cyanAlgorithm();
            } else {
                if (cyanGhostX >= 1044 + cyanGhostRadius) {
                    cyanGhostX = -cyanGhostRadius + cyanGhostMove;
                } else if (cyanGhostX <= -cyanGhostRadius) {
                    cyanGhostX = 1044 + cyanGhostRadius - cyanGhostMove;
                }
                else if(cyanRight) cyanGhostX+=cyanGhostMove;
                else if(cyanLeft) cyanGhostX-=cyanGhostMove;
                else if(cyanUp) cyanGhostY+=cyanGhostMove;
                else cyanGhostY-=cyanGhostMove;

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
                float X = (cyanGhostX+cyanGhostMove-cyanGhostScatterX)* (cyanGhostX+cyanGhostMove-cyanGhostScatterX);
                float Y = (cyanGhostY-cyanGhostScatterY) * (cyanGhostY-cyanGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !cyanRight)
            {
                float X = (cyanGhostX-cyanGhostMove-cyanGhostScatterX)* (cyanGhostX-cyanGhostMove-cyanGhostScatterX);
                float Y = (cyanGhostY-cyanGhostScatterY) * (cyanGhostY-cyanGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1] == 1 || noCoinLegalPoints[x][y+1] == 1) && !cyanDown)
            {
                float X = (cyanGhostX-cyanGhostScatterX)* (cyanGhostX-cyanGhostScatterX);
                float Y = (cyanGhostY+cyanGhostMove-cyanGhostScatterY) * (cyanGhostY+cyanGhostMove-cyanGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1] == 1 || noCoinLegalPoints[x][y-1] == 1) && !cyanUp)
            {
                float X = (cyanGhostX-cyanGhostScatterX) * (cyanGhostX-cyanGhostScatterX);
                float Y = (cyanGhostY-cyanGhostMove-cyanGhostScatterY) * (cyanGhostY-cyanGhostMove-cyanGhostScatterY);
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
                isCyanRightPng = true;
                isCyanLeftPng = false;
            }
            else if(ind==2)
            {
                cyanGhostX -= cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanLeft=true;
                isCyanRightPng = false;
                isCyanLeftPng = true;
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
