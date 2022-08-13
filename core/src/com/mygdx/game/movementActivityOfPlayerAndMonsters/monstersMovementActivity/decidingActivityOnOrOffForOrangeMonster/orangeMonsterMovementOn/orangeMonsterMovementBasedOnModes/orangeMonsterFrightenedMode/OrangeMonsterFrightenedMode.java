package com.mygdx.game.movementActivityOfPlayerAndMonsters.monstersMovementActivity.decidingActivityOnOrOffForOrangeMonster.orangeMonsterMovementOn.orangeMonsterMovementBasedOnModes.orangeMonsterFrightenedMode;

import com.mygdx.game.TheLastLife;
import com.mygdx.game.drawing.monsters.cyanMonster.cyanFrightenedDrawing.CyanDrawFrightened;
import com.mygdx.game.drawing.monsters.orangeMonster.orangeFrightenedDrawing.OrangeDrawFrightened;

import java.util.ArrayList;
import java.util.Random;

public class OrangeMonsterFrightenedMode extends TheLastLife {
    public OrangeMonsterFrightenedMode()
    {
        /**shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.BLUE);
         shapeRenderer.circle(cyanGhostX, cyanGhostY, cyanGhostRadius);
         shapeRenderer.end();*/
        //CyanDrawFrightened cyanDrawFrightened = new CyanDrawFrightened();
        OrangeDrawFrightened  orangeDrawFrightened = new OrangeDrawFrightened();

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

        if(On==false)
        {

            int x = (int) (orangeGhostX/cellWidth);
            int y = (int) (orangeGhostY/cellHeight);

            long totalDirection = 0;

            ArrayList<Long> Direction = new ArrayList<>();   //(Arrays. asList(10,19));
            //for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
            if((coins[x-1][y]==1 || noCoinLegalPoints[x-1][y]==1 ) && !orangeRight) {totalDirection++;Direction.add(1L);}
            if((coins[x+1][y]==1 || noCoinLegalPoints[x+1][y]==1 ) && !orangeLeft) {totalDirection++;Direction.add(2L);}
            if((coins[x][y-1]==1 || noCoinLegalPoints[x][y-1]==1 ) && !orangeUp) {totalDirection++; Direction.add(3L);}
            if((coins[x][y+1]==1 || noCoinLegalPoints[x][y+1]==1 ) && !orangeDown) {totalDirection++;Direction.add(4L);}


            // long ind = (long) (Math.random(1) % totalDirection);
            Random rand = new Random();
            long ind = rand.nextLong(totalDirection);

            long directionFinal = Direction.get((int) ind);

            if(directionFinal==2)
            {
                orangeGhostX += orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeRight=true;
                isOrangeRightPngFri = true;
                isOrangeLeftPngFri = false;
            }
            else if(directionFinal==1)
            {
                orangeGhostX -= orangeGhostMove;
                orangeRight=orangeLeft=orangeUp=orangeDown=false;
                orangeLeft=true;
                isOrangeRightPngFri = false;
                isOrangeLeftPngFri = true;
            }
            else if(directionFinal==4)
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
