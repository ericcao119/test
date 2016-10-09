package com.teammedi.game.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public abstract class GameObject implements Drawable{
	
	
	/*VARS*/
	
	//Physics Vars
	protected int x, y;//THESE MUST BE THE CENTER
	protected int w, h;
	protected int xVel, yVel;
	ArrayList<Rectangle> hitboxes;
	
	//Graphics
	Sprite spr;
	Texture texture;
	
	/*End VARS*/
	
	
	/*Constructor*/
	public GameObject(int x, int y, int w, int h, String sprite){
		init(x, y, w, h, sprite);
		
	}
	
	public boolean init(int x, int y, int w, int h, String str){
		
		try {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			texture = new Texture(str);
			spr = new Sprite(texture, x, y, w, h);
		} catch (Exception e) {//If there is a file error
			init();
			return false;
		}
		return true;
	}
	
	public void init(){
		this.x = 0;
		this.y = 0;
		this.w = 32;
		this.h = 32;
		texture = new Texture("test.png");
		spr = new Sprite(texture, x, y, w, h);
	}
	
	
	
	public int getX(){return x;}
	public int getY(){return y;}
	public int getWidth(){return w;}
	public int getHeight(){return h;}
	
	
	public abstract void update();
	public abstract void draw(Batch batch, float x, float y, float width, float height);
	
	
	//TODO Add functions from Drawable
	public abstract float getLeftWidth ();
	public abstract void setLeftWidth (float leftWidth);
	public abstract float getRightWidth ();
	public abstract  void setRightWidth (float rightWidth);
	public abstract float getTopHeight ();
	public abstract void setTopHeight (float topHeight);
	public abstract float getBottomHeight ();
	public abstract void setBottomHeight (float bottomHeight);
	public abstract float getMinWidth ();
	public abstract void setMinWidth (float minWidth);
	public abstract float getMinHeight ();
	public abstract void setMinHeight (float minHeight);
}
