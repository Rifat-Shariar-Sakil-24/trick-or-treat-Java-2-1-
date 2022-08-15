package com.mygdx.game.drawing.gameScreenDrawings.life.score;

import com.mygdx.game.TheLastLife;

public class Score extends TheLastLife {
    public Score()
    {
        String s = Long.toString(score);
        int gap = 0;
        int digitStartX=0;
        if(s.length()==1) digitStartX = (int) scoreDigitXForOne;
        if(s.length()==2) digitStartX = (int) scoreDigitXForTwo;
        if(s.length()==3) digitStartX = (int) scoreDigitXForThree;
        if(s.length()==4) digitStartX = (int) scoreDigitXForFour;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int ind = c-'0';
            batch.begin();
            batch.draw(scoreDigit[ind],digitStartX,scoreDigitY);
            batch.end();
            digitStartX += scoreDigitSpace;
            digitStartX += scoreDigitSize;


        }
    }
}
