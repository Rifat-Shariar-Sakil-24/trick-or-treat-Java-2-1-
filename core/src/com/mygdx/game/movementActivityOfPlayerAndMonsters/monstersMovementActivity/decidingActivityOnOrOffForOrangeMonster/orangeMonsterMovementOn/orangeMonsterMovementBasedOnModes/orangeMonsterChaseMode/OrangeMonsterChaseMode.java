package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanNormalDrawing.CyanDrawNormal;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeNormalDrawing.OrangeDrawNormal;

public class OrangeMonsterChaseMode extends TheLastLife {
    public OrangeMonsterChaseMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.CYAN);
         shapeRenderer.circle(cyanGhostX,cyanGhostY,cyanGhostRadius);
         shapeRenderer.end();*/
        OrangeDrawNormal orangeDraw = new OrangeDrawNormal();

        if(orangeGhostMovementOn==false) {orangeGhostX -= orangeGhostMove;orangeLeft=true;}
        else{

            if(orangeGhostX%cellWidth==0 && orangeGhostY%cellHeight==0)
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

        if (On == false)
        {

            /**
            int x = (int) (cyanGhostX/cellWidth);
            int y = (int) (cyanGhostY/cellHeight);

            float arcNewX = arcX, arcNewY = arcY;
            if(arcRight)arcNewX += (2*cellWidth);
            else if(arcLeft) arcNewX -= (2*cellWidth);
            else if(arcUp) {arcNewX -= (2*cellWidth); arcNewY += (2*cellHeight);}
            else arcNewY -= (2*cellHeight);

            float xDif = arcNewX - redGhostX;
            float yDif = arcNewY - redGhostY;

            arcNewX += xDif;
            arcNewY += yDif;

            int ind=1;
            float distanceXY = Float.MAX_VALUE;

            if((coins[x + 1][y] == 1 || noCoinLegalPoints[x + 1][y] == 1) && !cyanLeft)
            {
                float X = (cyanGhostX+cyanGhostMove-arcNewX)* (cyanGhostX+cyanGhostMove-arcNewX);
                float Y = (cyanGhostY-arcNewY) * (cyanGhostY-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !cyanRight)
            {
                float X = (cyanGhostX-cyanGhostMove-arcNewX)* (cyanGhostX-cyanGhostMove-arcNewX);
                float Y = (cyanGhostY-arcNewY) * (cyanGhostY-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1] == 1 || noCoinLegalPoints[x][y+1] == 1) && !cyanDown)
            {
                float X = (cyanGhostX-arcNewX)* (cyanGhostX-arcNewX);
                float Y = (cyanGhostY+cyanGhostMove-arcNewY) * (cyanGhostY+cyanGhostMove-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1] == 1 || noCoinLegalPoints[x][y-1] == 1) && !cyanUp)
            {
                float X = (cyanGhostX-arcNewX) * (cyanGhostX-arcNewX);
                float Y = (cyanGhostY-cyanGhostMove-arcNewY) * (cyanGhostY-cyanGhostMove-arcNewY);
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
            }*/

            float arcNewX = arcX, arcNewY = arcY;
            float dis = (arcX-orangeGhostX) * (arcX-orangeGhostX);
            dis += ((arcY-orangeGhostY) * (arcY-orangeGhostY));
            dis = (float) Math.sqrt(dis);

            if(dis<=(8*((cellHeight+cellWidth)/2))) {arcNewX = orangeGhostScatterX;arcNewY = orangeGhostScatterY;}




            int x = (int) (orangeGhostX/cellWidth);
            int y = (int) (orangeGhostY/cellHeight);

            int ind=0;
            float distanceXY = Float.MAX_VALUE;

            if((coins[x + 1][y] == 1 || noCoinLegalPoints[x + 1][y] == 1)  && !orangeLeft)
            {
                float X = (orangeGhostX+orangeGhostMove-arcNewX)* (orangeGhostX+orangeGhostMove-arcNewX);
                float Y = (orangeGhostY-arcNewY) * (orangeGhostY-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x - 1][y] == 1 || noCoinLegalPoints[x - 1][y] == 1) && !orangeRight)
            {
                float X = (orangeGhostX-orangeGhostMove-arcNewX)* (orangeGhostX-orangeGhostMove-arcNewX);
                float Y = (orangeGhostY-arcNewY) * (orangeGhostY-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1] == 1 || noCoinLegalPoints[x][y+1] == 1)  && !orangeDown)
            {
                float X = (orangeGhostX-arcNewX)* (orangeGhostX-arcNewX);
                float Y = (orangeGhostY+orangeGhostMove-arcNewY) * (orangeGhostY+orangeGhostMove-arcNewY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1] == 1 || noCoinLegalPoints[x][y-1] == 1)  && !orangeUp)
            {
                float X = (orangeGhostX-arcNewX) * (orangeGhostX-arcNewX);
                float Y = (orangeGhostY-orangeGhostMove-arcNewY) * (orangeGhostY-orangeGhostMove-arcNewY);
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



    private void orangeRightException(){

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

