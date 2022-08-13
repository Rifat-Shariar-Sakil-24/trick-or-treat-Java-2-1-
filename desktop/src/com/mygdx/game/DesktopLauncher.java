package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.TheLastLife;
import com.mygdx.game.screens.StartingScreen;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(1400,960);
		config.setTitle("The Last Life");
	//	new Lwjgl3Application(new StartingScreen(),config);
		new Lwjgl3Application(new TheLastLife(), config);

	}

}
