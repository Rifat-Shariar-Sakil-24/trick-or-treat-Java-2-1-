package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.coins.drawCoins.drawingCoinsOnMaze;
import com.mygdx.game.drawing.gameScreenDrawings.life.exitRestart.ExitRestart;
import com.mygdx.game.drawing.gameScreenDrawings.life.life.Life;
import com.mygdx.game.drawing.gameScreenDrawings.life.musicOnOff.MusicOnOff;
import com.mygdx.game.drawing.gameScreenDrawings.life.score.Score;
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
        PlayerMonsterCollision playerMonsterCollision = new PlayerMonsterCollision();
        DecidingModesForAllMonsters decidingModesForAllMonsters = new DecidingModesForAllMonsters();

        MovementActivityOfPlayerAndMonsters movementActivityOfPlayerAndMonsters = new MovementActivityOfPlayerAndMonsters();


        sprite.rotate(2);
        spriteBig.rotate(-2);

        batch.begin();
        batch.draw(sideImg,1040,0);
        batch.end();

        Score score1 = new Score();
        Life life1 = new Life();
        MusicOnOff musicOnOff = new MusicOnOff();
       // ExitRestart exitRestart = new ExitRestart();

        /*batch.begin();
        font.draw(batch,"SCORE",1150,900);
        batch.end();

        batch.begin();
        font.draw(batch,Long.toString(score),1150,850);
        batch.end();
        */



    }
}
