package com.teammedi.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.teammedi.game.MediGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Medi";
		
		config.width = 800;
		config.height = 600;
		
		new LwjglApplication(new MediGame(), config);
	}
}
