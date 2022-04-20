package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import com.sun.org.apache.xerces.internal.impl.xs.XSElementDeclHelper;
import jdk.vm.ci.code.Architecture;

import java.util.SortedMap;

public class GameOnTest extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Texture img;

	ShapeRenderer shapeRenderer;
	int arcX = 336;
	int arcY = 14*24;

	int radius = 18;
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


	char store ='0';


	int arcMove = 3;


	float[][] pointsValue = LegalPoints.getLegalPoints();
	float[][] gone = AliveCoins.returnAliveCoins();

    //red ghost
	float redGhostX = (14*24)+12;
	float redGhostY = 20*24;
	float redGhostRadius = 15;
	float redGhostMove= 1.5f;
	boolean redGhostMovementOn = false;
	boolean redRight=false,redLeft=false,redUp=false,redDown=false;


	//pink ghost
	float pinkGhostX = (14*24)+12-24;
	float pinkGhostY = 20*24;
	float pinkGhostRadius = 15;
	float pinkGhostMove= 1.5f;
	boolean pinkGhostMovementOn = false;
	boolean pinkRight=false,pinkLeft=false,pinkUp=false,pinkDown=false;


	BitmapFont font;




	/** INTERSECTION POINTS*/
	float[][] interSectionPoints = IntersectionPoints.returnInterSectionPoints();

	@Override
	public void create () {
		Gdx.input.setInputProcessor((InputProcessor) this);
		batch = new SpriteBatch();
		img = new Texture("maze3.png");


		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setAutoShapeType(true);



		for (int i = 0; i < 29; i++) {
			for (int j = 0; j < 32; j++) {
				//System.out.println(i+" "+j+"   "+gone[i][j]);
			}
		}
		gone[14][14]=1;
		font = new BitmapFont();




	}

	@Override
	public void render () {


		Gdx.gl.glClearColor(.35f,.23f,.15f,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();



       arcDraw();
	   coinsDraw();
	   drawRedGhost();
	   drawPinkGhost();
	   neededFontsDraw();



		//intersectionPointsDraw
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		for(int i=0;i<29;i++){
			for(int j=0;j<32;j++){
				shapeRenderer.setColor(Color.BLACK);
				//if(interSectionPoints[i][j]==1) shapeRenderer.circle(i*24,j*24,5);
			}
		}
		shapeRenderer.end();

	}



	private void arcDraw() {
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.YELLOW);
		if(arcRight)
		{
			arcX = Math.min(arcX,696-48);

			boolean valid = true;
			if(arcY%24==0 && arcX%24==0)
			{
				int x = arcX/24;
				int y = arcY/24;
				//System.out.print(pointsValue[x][y]+"  ");
				gone[x][y]=1;
				//System.out.println(pointsValue[x][y]);
				if(store=='w' && pointsValue[x][y+1]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcUp=true;
				}
				else if(store=='s' && pointsValue[x][y-1]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcDown=true;
				}
				if(pointsValue[x+1][y]==1) valid = false;

			}
			shapeRenderer.arc(arcX,arcY,radius,45,270);
			if(arcX!=696-48 && arcRight && valid)arcX += arcMove;
		}
		else if(arcLeft)
		{

			arcX = Math.max(arcX,48);
			boolean valid = true;
			if(arcY%24==0 && arcX%24==00)
			{
				int x = arcX/24;
				int y = arcY/24;
				gone[x][y]=1;
				if(store=='w' && pointsValue[x][y+1]==-1)
						{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcUp=true;
				}
				else if(store=='s' && pointsValue[x][y-1]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcDown=true;
				}
				if(pointsValue[x-1][y]==1) valid = false;
			}
			shapeRenderer.arc(arcX,arcY,radius,-135,270);
			if(arcX!=48 && arcLeft && valid)arcX -= arcMove;
		}
		else if(arcUp)
		{
			arcY = Math.min(arcY,768-48);

			boolean valid = true;
			if(arcY%24==0 && arcX%24==0)
			{
				int x = arcX/24;
				int y = arcY/24;
				gone[x][y]=1;
				//	System.out.println(x+" "+y);
				if(store=='d' && pointsValue[x+1][y]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcRight=true;
				}
				else if(store=='a' && pointsValue[x-1][y]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcLeft=true;
				}
				if(pointsValue[x][y+1]==1) valid=false;
			}
			shapeRenderer.arc(arcX,arcY,radius,135,270);
			if(arcY!=768-48 &&arcUp && valid)arcY += arcMove;

		}
		else if(arcDown)
		{
			arcY = Math.max(arcY,48);
			boolean valid = true;
			if(arcY%24==0 && arcX%24==0)
			{
				int x = arcX/24;
				int y = arcY/24;
				gone[x][y]=1;
				if(store=='d' && pointsValue[x+1][y]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcRight=true;
				}
				else if(store=='a' && pointsValue[x-1][y]==-1)
				{
					arcRight=arcLeft=arcUp=arcDown=false;
					arcLeft=true;
				}
				if(pointsValue[x][y-1]==1) valid=false;
			}

			shapeRenderer.arc(arcX,arcY,radius,-45,270);
			if(arcY!=48 &&arcDown && valid)arcY -= arcMove;
		}
		else shapeRenderer.arc(arcX,arcY,radius,45,270);
		shapeRenderer.end();

		// drawing lines and points
		shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
		shapeRenderer.setColor(Color.WHITE);
		for(int i=0;i<=768;i+=24){
			//shapeRenderer.line(i,0,i,768);
			//shapeRenderer.line(0,i,696,i);
		}

		shapeRenderer.end();

	}
	private void coinsDraw() {

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.BLACK);
		for(int i=0;i<29;i++) {
			for(int j=0;j<32;j++)
			{
				if(pointsValue[i][j]==1){
					//shapeRenderer.setColor(Color.RED);
					//shapeRenderer.circle(i * 24, j * 24, 4);
				}
				else{
					//pointsValue[i][j]=-1;
					if(gone[i][j]==-1)
					{
						shapeRenderer.setColor(Color.BROWN);
						shapeRenderer.circle(i * 24, j * 24, 4);
					}

				}

			}

		}

		shapeRenderer.end();

	}
	private void drawRedGhost() {

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.RED);
		System.out.println(redGhostX+"            " + redGhostY);
		shapeRenderer.circle(redGhostX,redGhostY,redGhostRadius);
		shapeRenderer.end();

		if(redGhostMovementOn==false) {redGhostX += redGhostMove;redGhostMovementOn=true;redRight=true;}
		else{

			if(redGhostX%24==0 && redGhostY%24==0)
			{
                int x = (int) (redGhostX/24);
				int y = (int) (redGhostY/24);
				if(interSectionPoints[x][y]==1)
				{
					System.out.println(x+"  "+y);
                       redAlgorithm();
				}
				else
				{
					if(redRight)
					{
						if(pointsValue[x+1][y]==-1)
						{
							redGhostX += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redRight=true;
						}
						else if(pointsValue[x][y+1]==-1)
						{
							redGhostY += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redUp=true;
						}
						else
						{
							redGhostY -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redDown=true;
						}
					}
					else if(redLeft)
					{
						if(pointsValue[x-1][y]==-1)
						{
							redGhostX -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redLeft=true;
						}
						else if(pointsValue[x][y+1]==-1)
						{
							redGhostY += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redUp=true;
						}
						else
						{
							redGhostY -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redDown=true;
						}
					}
					else if(redUp)
					{
						if(pointsValue[x][y+1]==-1)
						{
							redGhostY += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redUp=true;
						}
						else if(pointsValue[x+1][y]==-1)
						{
							redGhostX += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redRight=true;
						}
						else
						{
							redGhostX -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redLeft=true;
						}
					}
					else
					{
						if(pointsValue[x][y-1]==-1)
						{
							redGhostY -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redDown=true;
						}
						else if(pointsValue[x+1][y]==-1)
						{
							redGhostX += redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redRight=true;
						}
						else
						{
							redGhostX -= redGhostMove;
							redRight=redLeft=redUp=redDown=false;
							redLeft=true;
						}
					}
				}
			}
			else
			{
				if(redRight) redGhostX+=redGhostMove;
				else if(redLeft) redGhostX-=redGhostMove;
				else if(redUp) redGhostY+=redGhostMove;
				else redGhostY-=redGhostMove;
			}

		}

	}
	private void redAlgorithm() {

		float redXNow,redYNow;
		int x = (int) (redGhostX/24);
		int y = (int) (redGhostY/24);

		int ind=1;
		float distanceXY = Float.MAX_VALUE;
		if(pointsValue[x+1][y]==-1 && !redLeft)
		{
			float X = (redGhostX+redGhostMove-arcX)* (redGhostX+redGhostMove-arcX);
			float Y = (redGhostY-arcY) * (redGhostY-arcY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 1;
				distanceXY = distanceXYTrial;
			}

		}

		if(pointsValue[x-1][y]==-1 && !redRight)
		{
			float X = (redGhostX-redGhostMove-arcX)* (redGhostX-redGhostMove-arcX);
			float Y = (redGhostY-arcY) * (redGhostY-arcY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 2;
				distanceXY = distanceXYTrial;
			}

		}


		if(pointsValue[x][y+1]==-1 && !redDown)
		{
			float X = (redGhostX-arcX)* (redGhostX-arcX);
			float Y = (redGhostY+redGhostMove-arcY) * (redGhostY+redGhostMove-arcY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 3;
				distanceXY = distanceXYTrial;
			}

		}

		if(pointsValue[x][y-1]==-1 && !redUp)
		{
			float X = (redGhostX-arcX) * (redGhostX-arcX);
			float Y = (redGhostY-redGhostMove-arcY) * (redGhostY-redGhostMove-arcY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 4;
				distanceXY = distanceXYTrial;
			}

		}

		if(ind==1)
		{
			redGhostX += redGhostMove;
			redRight=redLeft=redUp=redDown=false;
			redRight=true;
		}
		else if(ind==2)
		{
			redGhostX -= redGhostMove;
			redRight=redLeft=redUp=redDown=false;
			redLeft=true;
		}
		else if(ind==3)
		{
			redGhostY += redGhostMove;
			redRight=redLeft=redUp=redDown=false;
			redUp=true;
		}
		else
		{
			redGhostY -= redGhostMove;
			redRight=redLeft=redUp=redDown=false;
			redDown=true;
		}


	}


	public void drawPinkGhost()
	{
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.PINK);
		System.out.println(pinkGhostX+"            " + pinkGhostY);
		shapeRenderer.circle(pinkGhostX,pinkGhostY,pinkGhostRadius);
		shapeRenderer.end();

		if(pinkGhostMovementOn==false) {pinkGhostX -= pinkGhostMove;pinkGhostMovementOn=true;pinkLeft=true;}
		else{

			if(pinkGhostX%24==0 && pinkGhostY%24==0)
			{
				int x = (int) (pinkGhostX/24);
				int y = (int) (pinkGhostY/24);
				pinkAlgorithm();
			}
			else
			{
				if(pinkRight) pinkGhostX+=pinkGhostMove;
				else if(pinkLeft) pinkGhostX-=pinkGhostMove;
				else if(pinkUp) pinkGhostY+=pinkGhostMove;
				else pinkGhostY-=pinkGhostMove;
			}

		}
	}

	private void pinkAlgorithm() {
		float redXNow,redYNow;
		int x = (int) (pinkGhostX/24);
		int y = (int) (pinkGhostY/24);

		float arcNewX = arcX, arcNewY = arcY;
		if(arcRight)arcNewX += 96;
		else if(arcLeft) arcNewX -= 96;
		else if(arcUp) {arcNewX -= 96; arcNewY += 96;}
		else arcNewY -= 96;

		int ind=1;
		float distanceXY = Float.MAX_VALUE;

		if(pointsValue[x+1][y]==-1 && !pinkLeft)
		{
			float X = (pinkGhostX+pinkGhostMove-arcNewX)* (pinkGhostX+pinkGhostMove-arcNewX);
			float Y = (pinkGhostY-arcNewY) * (pinkGhostY-arcNewY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 1;
				distanceXY = distanceXYTrial;
			}

		}

		if(pointsValue[x-1][y]==-1 && !pinkRight)
		{
			float X = (pinkGhostX-pinkGhostMove-arcNewX)* (pinkGhostX-pinkGhostMove-arcNewX);
			float Y = (pinkGhostY-arcNewY) * (pinkGhostY-arcNewY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 2;
				distanceXY = distanceXYTrial;
			}

		}


		if(pointsValue[x][y+1]==-1 && !pinkDown)
		{
			float X = (pinkGhostX-arcNewX)* (pinkGhostX-arcNewX);
			float Y = (pinkGhostY+pinkGhostMove-arcNewY) * (pinkGhostY+pinkGhostMove-arcNewY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 3;
				distanceXY = distanceXYTrial;
			}

		}

		if(pointsValue[x][y-1]==-1 && !pinkUp)
		{
			float X = (pinkGhostX-arcNewX) * (pinkGhostX-arcNewX);
			float Y = (pinkGhostY-pinkGhostMove-arcNewY) * (pinkGhostY-pinkGhostMove-arcNewY);
			float distanceXYTrial = (float) Math.sqrt(X+Y);
			if(distanceXYTrial < distanceXY)
			{
				ind = 4;
				distanceXY = distanceXYTrial;
			}

		}

		if(ind==1)
		{
			pinkGhostX += pinkGhostMove;
			pinkRight=pinkLeft=pinkUp=pinkDown=false;
			pinkRight=true;
		}
		else if(ind==2)
		{
			pinkGhostX -= pinkGhostMove;
			pinkRight=pinkLeft=pinkUp=pinkDown=false;
			pinkLeft=true;
		}
		else if(ind==3)
		{
			pinkGhostY += pinkGhostMove;
			pinkRight=pinkLeft=pinkUp=pinkDown=false;
			pinkUp=true;
		}
		else
		{
			pinkGhostY -= pinkGhostMove;
			pinkRight=pinkLeft=pinkUp=pinkDown=false;
			pinkDown=true;
		}


	}


	public void neededFontsDraw(){
		batch.begin();
		//font.draw(batch,"1",24,48);
		font.setColor(Color.BLACK);
		int val = 0;
		for(int i=0;i<29;i++) {
			String ss= String.valueOf(val);val++;
			//font.draw(batch,ss,i*24-8,24);
			//font.draw(batch,ss,i*24-8,768-24);

		}
		val=2;
		for(int i=2;i<=30;i++) {
			String ss= String.valueOf(val);val++;
			//font.draw(batch,ss,24-15,i*24+8);
			//font.draw(batch,ss,696-24-15,i*24+8);

		}
		batch.end();
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
			if(arcUp || arcDown) {store = 'd';}
			else
			{
				arcRight = arcLeft = arcDown = arcUp =  false;
				arcRight = true;
				store='0';
			}
		}
		if(character == 'a'){
			if(arcUp || arcDown) store = 'a';
			else
			{
				arcRight = arcLeft = arcDown = arcUp =  false;
				arcLeft = true;
				store='0';
			}
		}
		if(character=='w'){
			if(arcRight || arcLeft) store = 'w';
			else
			{
				arcRight = arcLeft = arcDown = arcUp =  false;
				arcUp = true;
				store='0';
			}

		}
		if(character=='s'){
			if(arcRight || arcLeft) store = 's';
			else
			{
				arcRight = arcLeft = arcDown = arcUp =  false;
				arcDown = true;
				store='0';
			}

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
