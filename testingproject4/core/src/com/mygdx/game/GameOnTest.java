package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import jdk.vm.ci.code.Architecture;

public class GameOnTest extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Texture img;

	ShapeRenderer shapeRenderer;
	int arcX = 336;
	int arcY = 48;

	int radius = 24;
	public float dif = 20;
	float line1X=20+dif,line1Y=20+dif;
	float line2X=1000-20-dif,line2Y=20+dif;
	float line3X=1000-20-dif,line3Y=800-20-dif;
	float line4X=20+dif,line4Y=800-20-dif;

	public boolean arcOn = false;
	boolean arcRight = false;
	boolean arcLeft = false;
	boolean arcUp = false;
	boolean arcDown = false;


	int arcMove = 2;


	float[][] pointsValue = LegalPoints.getLegalPoints();



	@Override
	public void create () {
		Gdx.input.setInputProcessor((InputProcessor) this);
		batch = new SpriteBatch();
		img = new Texture("maze3.png");
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setAutoShapeType(true);
	}

	@Override
	public void render () {


		Gdx.gl.glClearColor(.35f,.23f,.15f,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();



		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.YELLOW);
		if(arcRight)
		{

			arcX = Math.min(arcX,696-48);
			shapeRenderer.arc(arcX,arcY,radius,45,270);
			if(arcX!=696-48)arcX += arcMove;
		}
		else if(arcLeft)
		{
			arcX = Math.max(arcX,48);
			shapeRenderer.arc(arcX,arcY,radius,45,270);
			if(arcX!=48)arcX -= arcMove;
		}
		else if(arcUp)
		{
			arcY = Math.min(arcY,768-48);
			shapeRenderer.arc(arcX,arcY,radius,45,270);
			if(arcY!=768-48)arcY += arcMove;

		}
		else if(arcDown)
		{
			arcY = Math.max(arcY,48);
			shapeRenderer.arc(arcX,arcY,radius,45,270);
			if(arcY!=48)arcY -= arcMove;
		}
		else shapeRenderer.arc(arcX,arcY,radius,45,270);
		shapeRenderer.end();

		// drawing lines and points
		shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
		shapeRenderer.setColor(Color.WHITE);
		for(int i=0;i<=768;i+=24){
			shapeRenderer.line(i,0,i,768);
			shapeRenderer.line(0,i,696,i);
		}

		shapeRenderer.end();



		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.BLACK);
		for(int i=0;i<29;i++) {
			for(int j=0;j<32;j++)
			{
				if(pointsValue[i][j]==1){
					shapeRenderer.setColor(Color.RED);
					shapeRenderer.circle(i * 24, j * 24, 4);
				}
				else{
					pointsValue[i][j]=-1;
					shapeRenderer.setColor(Color.GREEN);
					shapeRenderer.circle(i * 24, j * 24, 4);
				}

			}

		}

		shapeRenderer.end();



	}


	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		if(character==' ')arcOn=true;
		if(character=='d'){
			arcRight = arcLeft = arcDown = arcUp =  false;
			arcRight = true;
		}
		if(character == 'a'){
			arcRight = arcLeft = arcDown = arcUp =  false;
			arcLeft = true;
		}
		if(character=='w'){

			arcRight = arcLeft = arcDown = arcUp =  false;
			arcUp = true;

		}
		if(character=='s'){
			arcRight = arcLeft = arcDown = arcUp =  false;
			arcDown = true;

		}
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {System.out.println(500);

		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {

		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		shapeRenderer.dispose();
	}

}
