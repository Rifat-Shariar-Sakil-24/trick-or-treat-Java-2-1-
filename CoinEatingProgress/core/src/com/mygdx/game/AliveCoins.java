package com.mygdx.game;

import java.util.Arrays;

public class AliveCoins {
    static float[][] pointsValue = LegalPoints.getLegalPoints();

    static float[][] returnAliveCoins(){
        float[][] alivePoints = new float[29][32];
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j < 32; j++) {
                alivePoints[i][j] = pointsValue[i][j];
            }
        }
        return alivePoints;
    }
}
