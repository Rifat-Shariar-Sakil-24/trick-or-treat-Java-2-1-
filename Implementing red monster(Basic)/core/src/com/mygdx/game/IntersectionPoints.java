package com.mygdx.game;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionPoints {
    static float[][] returnInterSectionPoints()
    {
        float[][] allInterSectionPoints = new float[29][32];
        for(int i=0;i<29;i++){
            for(int j=0;j<32;j++)allInterSectionPoints[i][j]=0;
        }

        int y=2;
        ArrayList<Integer> xAxis = new ArrayList<>(Arrays. asList(7,13,16,22));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=5;
        xAxis = new ArrayList<>(Arrays. asList(4,7,22,25));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=8;
        xAxis = new ArrayList<>(Arrays. asList(7,10,19,22));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=11;
        xAxis = new ArrayList<>(Arrays. asList(4,7,10,13,16,19,22,25));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=14;
        xAxis = new ArrayList<>(Arrays. asList(10,19));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=17;
        xAxis = new ArrayList<>(Arrays. asList(2,7,22,27));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();



        y=20;
        xAxis = new ArrayList<>(Arrays. asList(7,10,13,16,19,22));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


        y=23;
        xAxis = new ArrayList<>(Arrays. asList(4,7,22,25));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=26;
        xAxis = new ArrayList<>(Arrays. asList(2,7,10,19,22,27));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=28;
        xAxis = new ArrayList<>(Arrays. asList(13,16));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();

        y=30;
        xAxis = new ArrayList<>(Arrays. asList(7,22));
        for(int i=0;i<xAxis.size();i++) allInterSectionPoints[xAxis.get(i)][y]=1;
        xAxis.clear();


       return allInterSectionPoints;

    }

}
