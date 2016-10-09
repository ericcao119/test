package com.teammedi.game;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public class MediGame extends ApplicationAdapter {
	private OrthographicCamera camera;
	private ArrayList<Drawable> toDraw;//1.1 * map length
//	private ArrayList<GameObject> toUpdate;//3 * map length
	SpriteBatch batch;
	Sound sound;
	Music music;
	Texture img;
	
	@Override
	public void create () {
		float h = Gdx.graphics.getHeight();
		float w = Gdx.graphics.getWidth();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 600);
		batch  = new SpriteBatch();
		
		img = new Texture("badlogic.jpg");
		
		toDraw = new ArrayList<Drawable>();
		
//		sound = Gdx.audio.newSound(fileHandle)
//		music = Gdx.audio.newMusic(file)
//		music.setLooping(true);
	}

	/**
	 * Processes in render:
	 * There shall be 4 steps in render
	 * 
	 * Clearing the screen and updating the camera
	 * 
	 * Gathering the inputs
	 * 
	 * Updating the characters and see if any collisions occured
	 * 
	 * Render characters
	 */
	public void render () {
		//CLEAR STEP
		{
			Gdx.gl.glClearColor(1, 0, 0, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		}
		
		//INPUT STEP
		{
			
		}
		
		//UPDATE STEP
		{
			
		}
		
		//DRAW STEP
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();//Records draw commands
		
		{
			for(Drawable d: toDraw)
				d.draw(batch, 0, 0, 0, 0);
			batch.draw(img, 0, 0);
		}
		
		batch.end();//draws them
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
