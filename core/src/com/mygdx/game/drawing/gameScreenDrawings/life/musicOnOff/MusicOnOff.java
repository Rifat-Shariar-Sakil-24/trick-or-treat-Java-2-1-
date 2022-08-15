package com.mygdx.game.drawing.gameScreenDrawings.life.musicOnOff;

import com.mygdx.game.TheLastLife;

public class MusicOnOff extends TheLastLife {
    public MusicOnOff()
    {
        batch.begin();
        if(musicOn==1) {
            batch.draw(musicOnOffImage[0], musicOnOffImageX, musicOnOffImageY);
        }
        else {
            batch.draw(musicOnOffImage[1], musicOnOffImageX, musicOnOffImageY);
        }
        batch.end();
    }
}
