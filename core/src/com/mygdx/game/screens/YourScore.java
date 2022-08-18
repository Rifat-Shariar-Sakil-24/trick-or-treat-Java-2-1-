package com.mygdx.game.screens;

import com.mygdx.game.TheLastLife;

public class YourScore extends TheLastLife {
    public YourScore(){
        batch.begin();
        batch.draw(yourScoreImg,0,0);
        batch.end();



        String s = Long.toString(score);
        int gap = 0;
        int digitStartX=0;
        if(s.length()==1) digitStartX = (int) scoreDigitXForOneZeroLife;
        if(s.length()==2) digitStartX = (int) scoreDigitXForTwoZeroLife;
        if(s.length()==3) digitStartX = (int) scoreDigitXForThreeZeroLife;
        if(s.length()==4) digitStartX = (int) scoreDigitXForFourZeroLife;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int ind = c-'0';
            batch.begin();
            batch.draw(scoreDigit[ind],digitStartX,scoreDigitYZeroLifeY);
            batch.end();
            digitStartX += scoreDigitSpaceZeroLife;
            digitStartX += scoreDigitSizeZeroLife;

        }
        /*int drawStartX= (int) exitRestartOnGameScreenImageXZeroLife;

        for(int i=0;i<2;i++)
        {
            int ind = i;
            batch.begin();
            batch.draw(exitRestartOnGameScreenImage[ind],drawStartX,exitRestartOnGameScreenImageYZeroLife);
            batch.end();
            drawStartX += exitRestartOnGameScreenImageSpaceZeroLife;
            drawStartX += exitRestartOnGameScreenImageSizeZeroLife;

        }*/


    }
}
