package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForRedMonster.redMonsterMovementOn.redMonsterMovementBasedOnModes.redMonsterFrightenedMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.redMonster.redFrightenedDrawing.RedDrawFrightened;
//import com.mygdx.game.drawing.monsters.redMonster.redFrightenedDrawing.redDrawRightFrightened.RedDrawRightFrightened;
import com.mygdx.game.drawing.monsters.redMonster.redNormalDrawing.RedDrawNormal;

import java.util.ArrayList;
import java.util.Random;

public class RedMonsterFrightenedMode extends TheLastLife {
    public RedMonsterFrightenedMode()
    {
        /*shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.circle(redGhostX,redGhostY,redGhostRadius);
        shapeRenderer.end();*/
        RedDrawFrightened redDrawFrightened = new RedDrawFrightened();



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

            long totalDirection = 0;

            ArrayList<Long> Direction = new ArrayList<>();   //(Arrays. asList(10,19));
            //for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !redRight) {totalDirection++;Direction.add(1L);}
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1 ) && !redLeft) {totalDirection++;Direction.add(2L);}
            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1 ) && !redUp) {totalDirection++; Direction.add(3L);}
            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1 ) && !redDown) {totalDirection++;Direction.add(4L);}


           // long ind = (long) (Math.random(1) % totalDirection);
//            Random rand = new Random();
//            long ind = rand.nextLong(totalDirection);
            Random rand = new Random();
            long ind = Math.abs(rand.nextLong()) % totalDirection;


            long directionFinal = Direction.get((int) ind);


            if(directionFinal==2)
            {
                redGhostX += redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redRight=true;
                isRedRightPngFri = true;
                isRedLeftPngFri = false;
            }
            else if(directionFinal==1)
            {
                redGhostX -= redGhostMove;
                redRight=redLeft=redUp=redDown=false;
                redLeft=true;
                isRedRightPngFri = false;
                isRedLeftPngFri = true;
            }
            else if(directionFinal==4)
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
