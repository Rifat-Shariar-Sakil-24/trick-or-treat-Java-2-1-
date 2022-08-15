package com.mygdx.game.extra.setAllVariables;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.coins.pointsOnMazeForCoins.FrightenedModeCoinPoints;
import com.mygdx.game.coins.pointsOnMazeForCoins.LegalButNoCoinPoints;
import com.mygdx.game.coins.pointsOnMazeForCoins.LegalPoints;
import jdk.tools.jlink.internal.plugins.LegalNoticeFilePlugin;

public class SetAllVariablesForNewRound extends TheLastLife {
    public SetAllVariablesForNewRound()
    {

        timeState=0f;
        timeElapsedForPauseToMovementRedMonster = 0;
        timeElapsedForModeChangeRedMonster= 0;



        //Pacman all variables
        arcRight = false;arcLeft=false;arcUp=false;arcDown=false;
        arcMovementOn = false;
        arcX = (14*cellWidth)+ (cellWidth/2);arcY = 8*cellHeight;


        arcXMax = 1044-72;arcXMin = 72;arcYMax = 960-60;arcYMin = 60;
        arcRadius = 9;
        arcMove = arcMoveInitial;

        arcDirection ='0';
        playerMovementOn = false;


        coins = LegalPoints.returnLegalPoints();
        noCoinLegalPoints = LegalButNoCoinPoints.returnLegalButNoCoinPoints();





        //* ALl monster*//

        //RED GHOST//
        redGhostX= (14*cellWidth)+(cellWidth)/2;redGhostY=(20*cellHeight);


        redGhostScatterX = 29*36;
        redGhostScatterY = 32*30;

        redGhostEatenMode = false;
        redGhostScatterModeOn = true;
        redGhostChaseModeOn = false;

        modeChangeTimeInterval = 25;





        redGhostRadius = 9;
        redGhostMove= arcMove;
        redGhostMovementOn = false;
        redRight=false;redLeft=false;redUp=false;redDown=false;



        // ajke

        redGhostFrightenedModeOn = false;



        timeDurationOfGhostFrightenedModeRedMonster = 0;
        directionChangedOnFrightenedModeRed = false;
        isDirectionChangedOnEatenModeRed = false;
        redGhostSpeedIncreasedAfterEaten = false;
        increasedRedGhostSpeedAtEatenMode = 6;
        redGhostMoveInitial = redGhostMove;



        //for pink


        pinkGhostX=pinkGhostXInitial;pinkGhostY=pinkGhostYInitial;



        pinkGhostEatenMode = false;
        pinkGhostScatterModeOn = false;
        pinkGhostChaseModeOn = false;
        pinkGhostFrightenedModeOn = false;

        timeElapsedForPauseToMovementPinkMonster = 0;
        timeElapsedForModeChangePinkMonster = 0;




        pinkGhostMove= pinkGhostMoveInitial;
        pinkGhostMovementOn = false;
        pinkRight=false;pinkLeft=false;pinkUp=false;pinkDown=false;



        timeDurationOfGhostFrightenedModePinkMonster = 0;
        directionChangedOnFrightenedModePink = false;
        isDirectionChangedOnEatenModePink = false;
        pinkGhostSpeedIncreasedAfterEaten = false;
        increasedPinkGhostSpeedAtEatenMode = 6;


        pinkGhostOutOfGhostHouse = false;
        pinkGhostReachedOutOfGhostHouseEatenMode = false;




        // cyan
        cyanGhostX=cyanGhostXInitial;cyanGhostY=cyanGhostYInitial;

        cyanGhostScatterX = 0;
        cyanGhostScatterY = 0;

        cyanGhostEatenMode = false;
        cyanGhostScatterModeOn = false;
        cyanGhostChaseModeOn = false;
        cyanGhostFrightenedModeOn = false;

        timeElapsedForPauseToMovementCyanMonster = 0;
        timeElapsedForModeChangeCyanMonster = 0;




        cyanGhostMove= cyanGhostMoveInitial;
        cyanGhostMovementOn = false;
        cyanRight=false;cyanLeft=false;cyanUp=false;cyanDown=false;



        timeDurationOfGhostFrightenedModeCyanMonster = 0;
        directionChangedOnFrightenedModeCyan = false;
        isDirectionChangedOnEatenModeCyan = false;
        cyanGhostSpeedIncreasedAfterEaten = false;
        increasedCyanGhostSpeedAtEatenMode = 6;

        cyanGhostMoveInitial = redGhostMove;


        cyanGhostOutOfGhostHouse = false;
        cyanGhostCenterOfGhostHouse = false;
        cyanGhostReachedOutOfGhostHouseEatenMode = false;
        cyanGhostReachedCenterOfGhostHouseEatenMode = false;




        // orange

        orangeGhostX=orangeGhostXInitial;orangeGhostY=orangeGhostYInitial;

        orangeGhostScatterX = 29*cellWidth;
        orangeGhostScatterY = 0;

        orangeGhostEatenMode = false;
        orangeGhostScatterModeOn = false;
        orangeGhostChaseModeOn = false;
        orangeGhostFrightenedModeOn = false;

        timeElapsedForPauseToMovementOrangeMonster = 0;
        timeElapsedForModeChangeOrangeMonster = 0;



        orangeGhostRadius = 9;
        orangeGhostMove= arcMove;
        orangeGhostMovementOn = false;
        orangeRight=false;orangeLeft=false;orangeUp=false;orangeDown=false;



        timeDurationOfGhostFrightenedModeOrangeMonster = 0;
        directionChangedOnFrightenedModeOrange = false;
        isDirectionChangedOnEatenModeOrange = false;
        orangeGhostSpeedIncreasedAfterEaten = false;
        increasedOrangeGhostSpeedAtEatenMode = 6;

        orangeGhostMoveInitial = redGhostMove;


        orangeGhostOutOfGhostHouse = false;
        orangeGhostCenterOfGhostHouse = false;
        orangeGhostReachedOutOfGhostHouseEatenMode = false;
        orangeGhostReachedCenterOfGhostHouseEatenMode = false;

        totalLife--;
        if(totalLife==0){
            totalLife=3;
            //score = 0;
            amiOn = 3;
            musicOn = 0;
            timeElapsed = 3f;




             coins = LegalPoints.returnLegalPoints();
            noCoinLegalPoints = LegalButNoCoinPoints.returnLegalButNoCoinPoints();
            noteEatenCoins = new float[30][32];
            coinForFrightenedMode = FrightenedModeCoinPoints.returnFrightenedCoin();
            for(int i=0;i<30;i++)
            {
                for(int j=0;j<32;j++){
                    if(coins[i][j]==1) noteEatenCoins[i][j]=1;
                }
            }
            numberOfCoins = 246;
            menuStart = 1;
        }
        isPlayerRightPng = true;
        isPlayerLeftPng = false;






    }
}
