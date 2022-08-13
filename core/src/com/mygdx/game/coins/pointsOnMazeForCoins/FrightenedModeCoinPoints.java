package com.mygdx.game.coins.pointsOnMazeForCoins;

import java.util.ArrayList;
import java.util.Arrays;

public class FrightenedModeCoinPoints {
    public static float[][] returnFrightenedCoin()
    {
        float[][] frightenedCoins = new float[30][32];
        for(int i=0;i<30;i++){
            for(int j=0;j<32;j++)frightenedCoins[i][j]=0;
        }

        frightenedCoins[2][8]=1;
        frightenedCoins[27][8]=1;
        frightenedCoins[2][28]=1;
        frightenedCoins[27][28]=1;

        return frightenedCoins;
    }
}
