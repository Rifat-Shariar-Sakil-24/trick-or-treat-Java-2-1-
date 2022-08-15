package com.mygdx.game.drawing.gameScreenDrawings.life.life;

import com.mygdx.game.TheLastLife;

public class Life extends TheLastLife {
    public Life()
    {
        int s = (int) totalLife;
        int gap = 0;
        int lifeStartX=0;
        if(s==1) lifeStartX = (int) lifeXForOne;
        if(s==2) lifeStartX = (int) lifeXForTwo;
        if(s==3) lifeStartX = (int) lifeXForThree;


        for(int i=0;i<s;i++)
        {

            int ind = i;
            batch.begin();
            batch.draw(life[ind],lifeStartX,lifeY);
            batch.end();
            lifeStartX += lifeSpace;
            lifeStartX += lifeSize;

        }
    }
}
