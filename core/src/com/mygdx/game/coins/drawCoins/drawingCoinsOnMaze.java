package com.mygdx.game.coins.drawCoins;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.TheLastLife;

public class drawingCoinsOnMaze extends TheLastLife {
    public drawingCoinsOnMaze(){


        //shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        batch.begin();


        for(int i=0;i<30;i++){
            for(int j=0;j<32;j++){

                if(noteEatenCoins[i][j]==1) {
                   // shapeRenderer.setColor(Color.RED);
                    //shapeRenderer.circle(i*36,j*30,5);
                    if(coinForFrightenedMode[i][j]==1){

                        spriteBig.setPosition((i*cellWidth)-10,(j*cellHeight)-10);
                        spriteBig.draw(batch);

                    }
                    else{

                        sprite.setPosition((i*cellWidth)-7.5f,(j*cellHeight)-7.5f);
                        sprite.draw(batch);
                    }

                 //   batch.begin();
                   // sprite.rotate(2);

                 //   batch.end();

                }
                else if(noCoinLegalPoints[i][j]==1){

                   // shapeRenderer.setColor(Color.GREEN);
                    //shapeRenderer.circle(i*36,j*30,5);
                }
            }
        }
        //shapeRenderer.end();
        batch.end();

    }


}
