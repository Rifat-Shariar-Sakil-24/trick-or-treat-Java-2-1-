package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForCyanMonster.cyanMonsterMovementOn.cyanMonsterMovementBasedOnModes.cyanMonsterFrightenedMode;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanFrightenedDrawing.CyanDrawFrightened;

import java.util.ArrayList;
import java.util.Random;

public class CyanMonsterFrightenedMode extends TheLastLife {
    public CyanMonsterFrightenedMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.circle(cyanGhostX, cyanGhostY, cyanGhostRadius);
        shapeRenderer.end();*/
        CyanDrawFrightened cyanDrawFrightened = new CyanDrawFrightened();

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
                else if(cyanDown) cyanGhostY-=cyanGhostMove;
                else cyanGhostX -= cyanGhostMove;
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

        if(On==false)
        {

            int x = (int) (cyanGhostX/cellWidth);
            int y = (int) (cyanGhostY/cellHeight);

            long totalDirection = 0;

            ArrayList<Long> Direction = new ArrayList<>();   //(Arrays. asList(10,19));
            //for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !cyanRight) {totalDirection++;Direction.add(1L);}
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1 ) && !cyanLeft) {totalDirection++;Direction.add(2L);}
            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1 ) && !cyanUp) {totalDirection++; Direction.add(3L);}
            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1 ) && !cyanDown) {totalDirection++;Direction.add(4L);}


            // long ind = (long) (Math.random(1) % totalDirection);
//            Random rand = new Random();
//            long ind = rand.nextLong(totalDirection);
            Random rand = new Random();
            long ind = Math.abs(rand.nextLong()) % totalDirection;


            long directionFinal = Direction.get((int) ind);

            if(directionFinal==2)
            {
                cyanGhostX += cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanRight=true;
                isCyanRightPngFri = true;
                isCyanLeftPngFri = false;
            }
            else if(directionFinal==1)
            {
                cyanGhostX -= cyanGhostMove;
                cyanRight=cyanLeft=cyanUp=cyanDown=false;
                cyanLeft=true;
                isCyanRightPngFri = false;
                isCyanLeftPngFri = true;
            }
            else if(directionFinal==4)
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
