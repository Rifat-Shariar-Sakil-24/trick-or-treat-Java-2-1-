package com.mygdx.game.drawing.gameScreenDrawings.life.exitRestart;

import com.mygdx.game.TheLastLife;

public class ExitRestart extends TheLastLife {
    public ExitRestart(){

        int drawStartX= (int) exitRestartOnGameScreenImageX;

        for(int i=0;i<2;i++)
        {
            int ind = i;
            batch.begin();
            batch.draw(exitRestartOnGameScreenImage[ind],drawStartX,exitRestartOnGameScreenImageY);
            batch.end();
            drawStartX += exitRestartOnGameScreenImageSpace;
            drawStartX += exitRestartOnGameScreenImageSize;

        }
    }
}
