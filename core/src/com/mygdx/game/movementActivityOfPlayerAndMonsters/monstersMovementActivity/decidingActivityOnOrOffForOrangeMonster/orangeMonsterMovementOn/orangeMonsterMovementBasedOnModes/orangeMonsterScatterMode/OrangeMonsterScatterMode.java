package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterScatterMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing.OrangeDrawNormal;

public class OrangeMonsterScatterMode extends TheLastLife {
    public OrangeMonsterScatterMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.CYAN);
         shapeRenderer.circle(cyanGhostX, cyanGhostY, cyanGhostRadius);
         shapeRenderer.end();*/
        //CyanDrawNormal cyanDraw = new CyanDrawNormal();
        OrangeDrawNormal orangeDrawNormal = new OrangeDrawNormal();

        if (orangeGhostMovementOn == false) {
            orangeGhostX += orangeGhostMove;
            orangeGhostMovementOn = true;
            orangeRight = true;
        } else {


            if (orangeGhostX % cellWidth == 0 && orangeGhostY % cellHeight == 0)
            {
                orangeAlgorithm();
            }
            else
            {
                if(orangeGhostX>=1044+orangeGhostRadius)
                {
                    orangeGhostX = -orangeGhostRadius+orangeGhostMove;
                }
                else if(orangeGhostX<=-orangeGhostRadius)
                {
                    orangeGhostX = 1044+orangeGhostRadius-orangeGhostMove;
                }
                else if(orangeRight) orangeGhostX+=orangeGhostMove;
                else if(orangeLeft) orangeGhostX-=orangeGhostMove;
                else if(orangeUp) orangeGhostY+=orangeGhostMove;
                else  orangeGhostY-=orangeGhostMove;
            }

        }
    }

    private void orangeAlgorithm() {
        boolean On = false;

        if (orangeGhostY / cellHeight == 17 && orangeGhostX / cellWidth >= 27) {
            orangeRightException();
            On = true;
        }
        else if (orangeGhostY / cellHeight == 17 && orangeGhostX / cellWidth <= 2) {
            orangeLeftException();
            On = true;
        }


        if(On == false)
        {
            int x = (int) (orangeGhostX/cellWidth);
            int y = (int) (orangeGhostY/cellHeight);



            int ind=1;
            float distanceXY = Float.MAX_VALUE;

            if((coins[x + 1][y] == 1 || noCoinLegalPoints[x + 1][y] == 1) && !orangeLeft)
            {
                float X = (orangeGhostX+orangeGhostMove-orangeGhostScatterX)* (orangeGhostX+orangeGhostMove-orangeGhostScatterX);
                float Y = (orangeGhostY-orangeGhostScatterY) * (orangeGhostY-orangeGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !orangeRight)
            {
                float X = (orangeGhostX-orangeGhostMove-orangeGhostScatterX)* (orangeGhostX-orangeGhostMove-orangeGhostScatterX);
                float Y = (orangeGhostY-orangeGhostScatterY) * (orangeGhostY-orangeGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1] == 1 || noCoinLegalPoints[x][y+1] == 1) && !orangeDown)
            {
                float X = (orangeGhostX-orangeGhostScatterX)* (orangeGhostX-orangeGhostScatterX);
                float Y = (orangeGhostY+orangeGhostMove-orangeGhostScatterY) * (orangeGhostY+orangeGhostMove-orangeGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1] == 1 || noCoinLegalPoints[x][y-1] == 1) && !orangeUp)
            {
                float X = (orangeGhostX-orangeGhostScatterX) * (orangeGhostX-orangeGhostScatterX);
                float Y = (orangeGhostY-orangeGhostMove-orangeGhostScatterY) * (orangeGhostY-orangeGhostMove-orangeGhostScatterY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 4;
                    distanceXY = distanceXYTrial;
                }

            }

            if(ind==1)
            {
                orangeGhostX += orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeRight=true;
                isOrangeRightPng = true;
                isOrangeLeftPng = false;
            }
            else if(ind==2)
            {
                orangeGhostX -= orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeLeft=true;
                isOrangeRightPng = false;
                isOrangeLeftPng = true;
            }
            else if(ind==3)
            {
                orangeGhostY += orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeUp=true;
            }
            else
            {
                orangeGhostY -= orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeDown=true;
            }
        }
    }


    private void orangeRightException() {
        if(orangeRight) {
            if(orangeGhostX >= 1044+orangeGhostRadius){
                orangeGhostX = -orangeGhostRadius;
            }
            orangeGhostX += orangeGhostMove;
        }
        else if(orangeLeft) {
            orangeGhostX-=orangeGhostMove;
        }
    }
    private void orangeLeftException() {
        if(orangeRight) {
            orangeGhostX += orangeGhostMove;
        }
        else if(orangeLeft) {
            if(orangeGhostX<=-orangeGhostRadius){
                orangeGhostX = 1044+orangeGhostRadius;
            }
            orangeGhostX-=orangeGhostMove;
        }
    }
}
