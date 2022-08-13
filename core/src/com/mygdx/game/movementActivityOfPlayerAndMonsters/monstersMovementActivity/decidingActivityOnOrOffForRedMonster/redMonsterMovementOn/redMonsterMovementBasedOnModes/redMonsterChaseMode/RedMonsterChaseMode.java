package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterChaseMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.redMonster.redNormalDrawing.RedDrawNormal;

public class RedMonsterChaseMode extends TheLastLife {
    public RedMonsterChaseMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.circle(redGhostX,redGhostY,redGhostRadius);
        shapeRenderer.end();

        batchRed.begin();
        batchRed.draw(redMonster,redGhostX-(52/2),redGhostY-(52/2)-3);
        batchRed.end();*/
        RedDrawNormal redDraw = new RedDrawNormal();

        if(redGhostMovementOn==false) {redGhostX += redGhostMove;redGhostMovementOn=true;redRight=true;isRedRightPng=true;}
        else{

            if(redGhostX%cellWidth==0 && redGhostY%cellHeight==0)
            {

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
                float X = (redGhostX+redGhostMove-arcX)* (redGhostX+redGhostMove-arcX);
                float Y = (redGhostY-arcY) * (redGhostY-arcY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 1;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !redRight)
            {
                float X = (redGhostX-redGhostMove-arcX)* (redGhostX-redGhostMove-arcX);
                float Y = (redGhostY-arcY) * (redGhostY-arcY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 2;
                    distanceXY = distanceXYTrial;
                }

            }


            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1) && !redDown)
            {
                float X = (redGhostX-arcX)* (redGhostX-arcX);
                float Y = (redGhostY+redGhostMove-arcY) * (redGhostY+redGhostMove-arcY);
                float distanceXYTrial = (float) Math.sqrt(X+Y);
                if(distanceXYTrial < distanceXY)
                {
                    ind = 3;
                    distanceXY = distanceXYTrial;
                }

            }

            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1)&& !redUp)
            {
                float X = (redGhostX-arcX) * (redGhostX-arcX);
                float Y = (redGhostY-redGhostMove-arcY) * (redGhostY-redGhostMove-arcY);
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
                isRedRightPng = true;
                isRedLeftPng = false;
            }
            else if(ind==2)
            {
                redGhostX -= redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redLeft=true;
                isRedRightPng = false;
                isRedLeftPng = true;
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
