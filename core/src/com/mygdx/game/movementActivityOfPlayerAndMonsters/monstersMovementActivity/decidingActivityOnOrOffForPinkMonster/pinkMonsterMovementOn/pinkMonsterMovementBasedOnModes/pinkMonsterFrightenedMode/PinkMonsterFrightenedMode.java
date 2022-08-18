package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForPinkMonster.pinkMonsterMovementOn.pinkMonsterMovementBasedOnModes.pinkMonsterFrightenedMode;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.pinkMonster.pinkFrightenedDrawing.PinkDrawFrightened;

import java.util.ArrayList;
import java.util.Random;

public class PinkMonsterFrightenedMode extends TheLastLife {
    public PinkMonsterFrightenedMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
        shapeRenderer.end();*/
        PinkDrawFrightened pinkDrawFrightened = new PinkDrawFrightened();

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
            float redXNow,redYNow;
            int x = (int) (pinkGhostX/cellWidth);
            int y = (int) (pinkGhostY/cellHeight);

            long totalDirection = 0;

            ArrayList<Long> Direction = new ArrayList<>();   //(Arrays. asList(10,19));
            //for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !pinkRight) {totalDirection++;Direction.add(1L);}
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1 ) && !pinkLeft) {totalDirection++;Direction.add(2L);}
            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1 ) && !pinkUp) {totalDirection++; Direction.add(3L);}
            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1 ) && !pinkDown) {totalDirection++;Direction.add(4L);}


            // long ind = (long) (Math.random(1) % totalDirection);
//            Random rand = new Random();
//            long ind = rand.nextLong(totalDirection);
            Random rand = new Random();
            long ind = Math.abs(rand.nextLong()) % totalDirection;


            long directionFinal = Direction.get((int) ind);


            if(directionFinal==2)
            {
                pinkGhostX += pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkRight=true;
                isPinkRightPngFri = true;
                isPinkLeftPngFri = false;
            }
            else if(directionFinal==1)
            {
                pinkGhostX -= pinkGhostMove;
                pinkRight=pinkLeft=pinkUp=pinkDown=false;
                pinkLeft=true;
                isPinkRightPngFri = false;
                isPinkLeftPngFri = true;
            }
            else if(directionFinal==4)
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

