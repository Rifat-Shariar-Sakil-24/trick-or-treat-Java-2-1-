package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.coins.drawCoins.drawingCoinsOnMaze;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.DecidingModesForAllMonsters;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.MovementActivityOfPlayerAndMonsters;
import com.mygdx.game.playerMonsterCollision.PlayerMonsterCollision;

public class GamePlayScreen extends TheLastLife {

    public GamePlayScreen(){

        timeState += Gdx.graphics.getDeltaTime();

        if(timeState>=1f){
            timeState=0f;

            // forRed
            timeElapsedForPauseToMovementRedMonster++;
            if(playerMovementOn && redGhostFrightenedModeOn==false && redGhostEatenMode ==false)timeElapsedForModeChangeRedMonster++;
            if(redGhostFrightenedModeOn) timeDurationOfGhostFrightenedModeRedMonster++;

            //forPink
            timeElapsedForPauseToMovementPinkMonster++;
            if(playerMovementOn && pinkGhostFrightenedModeOn==false && pinkGhostEatenMode ==false)timeElapsedForModeChangePinkMonster++;
            if(pinkGhostFrightenedModeOn) timeDurationOfGhostFrightenedModePinkMonster++;

            //forCyan
            timeElapsedForPauseToMovementCyanMonster++;
            if(playerMovementOn && cyanGhostFrightenedModeOn==false && cyanGhostEatenMode ==false)timeElapsedForModeChangeCyanMonster++;
            if(cyanGhostFrightenedModeOn) timeDurationOfGhostFrightenedModeCyanMonster++;


            //forOrange
            timeElapsedForPauseToMovementOrangeMonster++;
            if(playerMovementOn && orangeGhostFrightenedModeOn==false && orangeGhostEatenMode ==false)timeElapsedForModeChangeOrangeMonster++;
            if(orangeGhostFrightenedModeOn) timeDurationOfGhostFrightenedModeOrangeMonster++;





        }

        //Background bg = new Background();
        batch.begin();
        batch.draw(img,0,0);
        batch.end();


        drawingCoinsOnMaze drawingCoinsOnMaze = new drawingCoinsOnMaze();
        MovementActivityOfPlayerAndMonsters movementActivityOfPlayerAndMonsters = new MovementActivityOfPlayerAndMonsters();
        DecidingModesForAllMonsters decidingModesForAllMonsters = new DecidingModesForAllMonsters();
        PlayerMonsterCollision playerMonsterCollision = new PlayerMonsterCollision();

        sprite.rotate(2);
        spriteBig.rotate(-2);

        batch.begin();
        batch.draw(sideImg,1044,0);
        batch.end();

        batch.begin();
        font.draw(batch,"SCORE",1150,900);
        batch.end();

        batch.begin();
        font.draw(batch,Long.toString(score),1150,850);
        batch.end();


    }
}