package com.mygdx.game;

public class LegalPoints {
   static float[][] arr = IllegalPoints.dots();
    static float[][] legalPoints = new float[29][32];


    public static float[][] getLegalPoints(){
        for(int i=0;i<arr.length;i++){
            legalPoints[(int) arr[i][0]][(int) arr[i][1]]=1;
        }
        for(int i=0;i<legalPoints.length;i++){
            for(int j=0;j<legalPoints.length;j++) //System.out.println(i+" "+j+" "+Points[i][j]);
                if(legalPoints[i][j]==0f){

                }
        }
        return legalPoints;
    }
}
