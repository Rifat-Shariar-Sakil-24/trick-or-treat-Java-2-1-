package com.mygdx.game.coins.pointsOnMazeForCoins;

import java.util.ArrayList;
import java.util.Arrays;

public class LegalButNoCoinPoints {
    public static float[][] returnLegalButNoCoinPoints()
    {
        float[][] allNocoinLegalPoints = new float[30][32];
        for(int i=0;i<30;i++){
            for(int j=0;j<32;j++)allNocoinLegalPoints[i][j]=0;
        }

        int y=12;
        ArrayList<Integer> xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=13;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=14;
        xAxis = new ArrayList<>(Arrays. asList(10,11,12,13,14,15,16,17,18,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=15;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=16;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=17;
        xAxis = new ArrayList<>(Arrays. asList(0,1,2,3,4,5,6,8,9,10,19,20,21,23,24,25,26,27,28,29));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=18;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=19;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=20;
        xAxis = new ArrayList<>(Arrays. asList(10,11,12,13,14,15,16,17,18,19));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=21;
        xAxis = new ArrayList<>(Arrays. asList(13,16));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=22;
        xAxis = new ArrayList<>(Arrays. asList(13,16));
        for(int i=0;i<xAxis.size();i++) allNocoinLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        return allNocoinLegalPoints;

    }
}
