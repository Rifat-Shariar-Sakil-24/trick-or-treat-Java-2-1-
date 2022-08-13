package com.mygdx.game.coins.pointsOnMazeForCoins;

import java.util.ArrayList;
import java.util.Arrays;

public class LegalPoints {
    public static float[][] returnLegalPoints()
    {
        float[][] allLegalPoints = new float[30][32];
        for(int i=0;i<30;i++){
            for(int j=0;j<32;j++)allLegalPoints[i][j]=0;
        }

        int y=2;
        ArrayList<Integer> xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=3;
        xAxis = new ArrayList<>(Arrays. asList(2,13,16,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=4;
        xAxis = new ArrayList<>(Arrays. asList(2,13,16,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=5;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,10,11,12,13,16,17,18,19,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=6;
        xAxis = new ArrayList<>(Arrays. asList(4,7,10,19,22,25));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=7;
        xAxis = new ArrayList<>(Arrays. asList(4,7,10,19,22,25));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=8;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        y=9;
        xAxis = new ArrayList<>(Arrays. asList(2,7,13,16,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=10;
        xAxis = new ArrayList<>(Arrays. asList(2,7,13,16,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=11;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,8,9,10,11,12,13,16,17,18,19,20,21,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=12;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=13;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=14;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=15;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=16;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=17;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=18;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=19;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=20;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=21;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=22;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=23;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,10,11,12,13,16,17,18,19,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        y=24;
        xAxis = new ArrayList<>(Arrays. asList(2,7,10,19,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=25;
        xAxis = new ArrayList<>(Arrays. asList(2,7,10,19,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        y=26;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=27;
        xAxis = new ArrayList<>(Arrays. asList(2,7,13,16,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        y=28;
        xAxis = new ArrayList<>(Arrays. asList(2,7,13,16,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=29;
        xAxis = new ArrayList<>(Arrays. asList(2,7,13,16,22,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=30;
        xAxis = new ArrayList<>(Arrays. asList(2,3,4,5,6,7,8,9,10,11,12,13,16,17,18,19,20,21,22,23,24,25,26,27));
        for(int i=0;i<xAxis.size();i++) allLegalPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        /*int coinss = 0;
        for(int i=0;i<30;i++){
            for(int j=0;j<32;j++)if(allLegalPoints[i][j]==1) coinss++;
        }

        System.out.println("coins: "+coinss);*/




        return allLegalPoints;

    }
}
