package com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection.PlayerDownMovement;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection.PlayerLeftMovement;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection.PlayerRightMovement;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.playerMovementActivity.playerMovementOn.playerMovementOnDirection.PlayerUpMovement;

public class PlayerMovementOn extends TheLastLife {
     public PlayerMovementOn()
     {
         shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
         shapeRenderer.setColor(Color.YELLOW);
         if(arcRight==false && arcLeft==false && arcDown== false && arcUp==false){arcRight=true;arcDirection='d';}

         if(arcRight) {
             PlayerRightMovement pacrightmove = new PlayerRightMovement();}
         else if(arcLeft){
             PlayerLeftMovement pacleftmove = new PlayerLeftMovement();}
         else if(arcUp){
             PlayerUpMovement pacupmove = new PlayerUpMovement();}
         else if(arcDown){
             PlayerDownMovement pacdownmove = new PlayerDownMovement();}
         else shapeRenderer.arc(arcX,arcY,arcRadius,45,270);
         shapeRenderer.end();

         // drawing lines and points
         shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
         shapeRenderer.setColor(Color.WHITE);
         for(int i=0;i<=1044;i+=36){

             //shapeRenderer.line(i,0,i,960);
             //shapeRenderer.line(0,i,696,i);
         }
         for(int i=0;i<=1044;i+=30){

             //shapeRenderer.line(i,0,i,768);
             //shapeRenderer.line(0,i,1044,i);
         }

         shapeRenderer.end();
     }
}
