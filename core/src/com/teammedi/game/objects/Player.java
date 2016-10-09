package com.teammedi.game.objects;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.badlogic.gdx.graphics.g2d.Batch;

public class Player extends GameObject{
	
	
	/*
	 * Notes:
	 * Characters should clear the input array every update unless in stun
	 * 
	 * If in stun the character should keep the buffer of the inputs and enact the first
	 * set of bufferable inputs
	 * 
	 * Example buffering attack through hitstun
	 * 
	 * However, multiple attacks should not be buffered during hitstun
	 * 
	 */
	
	
	
	
	
	//Specific byte references certain moves
	private byte[] inputs;
	private boolean inactive;//rename this to uncontrollable by player
	
	public Player(int x, int y, int w, int h, String sprite) {
		super(x, y, w, h, sprite);
		inputs = new byte[16];
	}

	@Override
	public void update() {
		
		//Clear buffered inputs if not stunned
		if(!inactive)
			Arrays.fill(inputs, (Byte) null);
		
	}
	
	public void move(){
		
	}
	
	
	@Override
	public void draw(Batch batch, float x, float y, float width, float height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getLeftWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLeftWidth(float leftWidth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getRightWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRightWidth(float rightWidth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTopHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTopHeight(float topHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getBottomHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBottomHeight(float bottomHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getMinWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMinWidth(float minWidth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getMinHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMinHeight(float minHeight) {
		// TODO Auto-generated method stub
		
	}

}
