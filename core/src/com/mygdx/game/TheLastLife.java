package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.mygdx.game.coins.drawCoins.drawingCoinsOnMaze;
import com.mygdx.game.coins.pointsOnMazeForCoins.FrightenedModeCoinPoints;
import com.mygdx.game.coins.pointsOnMazeForCoins.LegalButNoCoinPoints;
import com.mygdx.game.coins.pointsOnMazeForCoins.LegalPoints;
import com.mygdx.game.extra.playerDirectionCommandStore.PlayerDirectionCommandStore;
import com.mygdx.game.extra.setAllVariablesRestart.SetAllVariablesRestart;
import com.mygdx.game.monsterModes.decidingModesForAllMonsters.DecidingModesForAllMonsters;
import com.mygdx.game.movementActivityOfPlayerAndMonsters.MovementActivityOfPlayerAndMonsters;
import com.mygdx.game.playerMonsterCollision.PlayerMonsterCollision;
import com.mygdx.game.screens.*;
import jdk.javadoc.internal.tool.Start;

import javax.swing.plaf.TextUI;
import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.util.Set;

public class TheLastLife extends ApplicationAdapter implements InputProcessor  {


	public static float timeState=0f;



	public static float cellWidth = 36;
	public static float cellHeight = 30;



	//Pacman all variables
	public static boolean arcRight = false,arcLeft=false,arcUp=false,arcDown=false;
	public static boolean arcMovementOn = false;
	public static float arcX = (14*cellWidth)+ (cellWidth/2),arcY = 8*cellHeight;


	public static float arcXMax = 1044-72,arcXMin = 72, arcYMax = 960-60, arcYMin = arcYMin = 60;
	public static float arcRadius = 9;
	public static float arcMoveInitial=3;
	public static float arcMove = arcMoveInitial;

	public static char arcDirection ='0';

	public static boolean playerMovementOn = false;


	public static float[][] coins = LegalPoints.returnLegalPoints();
	public static float[][] noCoinLegalPoints = LegalButNoCoinPoints.returnLegalButNoCoinPoints();
	public static float[][] noteEatenCoins = new float[30][32];
	public static ShapeRenderer shapeRenderer;


	public static SpriteBatch batch;
	public static Texture img;


	//* ALl monster*//
	public static long modeChangeTimeInterval = 30;
	//RED GHOST//
	public static float redGhostXInitial = (14*cellWidth)+(cellWidth)/2,redGhostYInitial=(20*cellHeight);
	public static float redGhostX=redGhostXInitial,redGhostY=redGhostYInitial;

	public static float redGhostScatterX = 29*36;
	public static float redGhostScatterY = 32*30;

	public static boolean redGhostEatenMode = false;
	public static boolean redGhostScatterModeOn = true;
	public static boolean redGhostChaseModeOn = false;

	public static long timeElapsedForPauseToMovementRedMonster = 0;
	public static long timeElapsedForModeChangeRedMonster = 0;



	public static float redGhostRadius = 9;
	public static float redGhostMove= arcMove;
	public static boolean redGhostMovementOn = false;
	public static boolean redRight=false,redLeft=false,redUp=false,redDown=false;




	// ajke

	public static float[][] coinForFrightenedMode = FrightenedModeCoinPoints.returnFrightenedCoin();
	public static boolean redGhostFrightenedModeOn = false;
	public static long timeDurationOfGhostFrightenedModeRedMonster = 0;
	public static boolean directionChangedOnFrightenedModeRed = false;
	public static boolean isDirectionChangedOnEatenModeRed = false;
	public static boolean redGhostSpeedIncreasedAfterEaten = false;
	public static long increasedRedGhostSpeedAtEatenMode = 6;
	public static float redGhostMoveInitial = redGhostMove;



	//for pinkMonster

	public static float pinkGhostXInitial = (14*cellWidth)+(cellWidth)/2,pinkGhostYInitial=(20*cellHeight)-(3*cellHeight);
	public static float pinkGhostX=pinkGhostXInitial,pinkGhostY=pinkGhostYInitial;

	public static float pinkGhostScatterX = 0;
	public static float pinkGhostScatterY = 32*30;

	public static boolean pinkGhostEatenMode = false;
	public static boolean pinkGhostScatterModeOn = false;
	public static boolean pinkGhostChaseModeOn = false;
	public static boolean pinkGhostFrightenedModeOn = false;

	public static long timeElapsedForPauseToMovementPinkMonster = 0;
	public static long timeElapsedForModeChangePinkMonster = 0;



	public static float pinkGhostRadius = 9;
	public static float pinkGhostMove= arcMove;
	public static boolean pinkGhostMovementOn = false;
	public static boolean pinkRight=false,pinkLeft=false,pinkUp=false,pinkDown=false;



	public static long timeDurationOfGhostFrightenedModePinkMonster = 0;
	public static boolean directionChangedOnFrightenedModePink = false;
	public static boolean isDirectionChangedOnEatenModePink = false;
	public static boolean pinkGhostSpeedIncreasedAfterEaten = false;
	public static long increasedPinkGhostSpeedAtEatenMode = 6;

	public static float pinkGhostMoveInitial = redGhostMove;


   public static boolean pinkGhostOutOfGhostHouse = false;
   public static boolean pinkGhostReachedOutOfGhostHouseEatenMode = false;




   // forCyanMonster
    public static float cyanGhostXInitial = (13*cellWidth),cyanGhostYInitial=(20*cellHeight)-(3*cellHeight);
	public static float cyanGhostX=cyanGhostXInitial,cyanGhostY=cyanGhostYInitial;

	public static float cyanGhostScatterX = 0;
	public static float cyanGhostScatterY = 0;

	public static boolean cyanGhostEatenMode = false;
	public static boolean cyanGhostScatterModeOn = false;
	public static boolean cyanGhostChaseModeOn = false;
	public static boolean cyanGhostFrightenedModeOn = false;

	public static long timeElapsedForPauseToMovementCyanMonster = 0;
	public static long timeElapsedForModeChangeCyanMonster = 0;



	public static float cyanGhostRadius = 9;
	public static float cyanGhostMove = arcMove;
	public static boolean cyanGhostMovementOn = false;
	public static boolean cyanRight=false,cyanLeft=false,cyanUp=false,cyanDown=false;



	public static long timeDurationOfGhostFrightenedModeCyanMonster = 0;
	public static boolean directionChangedOnFrightenedModeCyan = false;
	public static boolean isDirectionChangedOnEatenModeCyan = false;
	public static boolean cyanGhostSpeedIncreasedAfterEaten = false;
	public static long increasedCyanGhostSpeedAtEatenMode = 6;

	public static float cyanGhostMoveInitial = redGhostMove;


	public static boolean cyanGhostOutOfGhostHouse = false;
	public static boolean cyanGhostCenterOfGhostHouse = false;
	public static boolean cyanGhostReachedOutOfGhostHouseEatenMode = false;
	public static boolean cyanGhostReachedCenterOfGhostHouseEatenMode = false;

	//29-4-2022
	//red

	public static SpriteBatch batchRed;
	public static Texture redMonsterRight,redMonsterLeft;
	public static boolean isRedRightPng = true;
	public static boolean isRedLeftPng = false;
	public static float redWidthPng = 40;
	public static float redHeightPng = 35;


	public static SpriteBatch batchRedFri;
	public static Texture redMonsterRightFri,redMonsterLeftFri;
	public static boolean isRedRightPngFri = true;
	public static boolean isRedLeftPngFri = false;


	public static SpriteBatch batchRedEaten;
	public static Texture redMonsterRightEaten,redMonsterLeftEaten;
	public static boolean isRedRightPngEaten = true;
	public static boolean isRedLeftPngEaten = false;
	public static float redWidthPngEaten = 38;
	public static float redHeightPngEaten = 43;



	public static SpriteBatch batchPink;
	public static Texture pinkMonsterRight,pinkMonsterLeft;
	public static boolean isPinkRightPng = true;
	public static boolean isPinkLeftPng = false;
	public static float pinkWidthPng = 40;
	public static float pinkHeightPng = 35;


	public static SpriteBatch batchPinkFri;
	public static Texture pinkMonsterRightFri,pinkMonsterLeftFri;
	public static boolean isPinkRightPngFri = true;
	public static boolean isPinkLeftPngFri = false;


	public static SpriteBatch batchPinkEaten;
	public static Texture pinkMonsterRightEaten,pinkMonsterLeftEaten;
	public static boolean isPinkRightPngEaten = true;
	public static boolean isPinkLeftPngEaten = false;
	public static float pinkWidthPngEaten = 38;
	public static float pinkHeightPngEaten = 43;



	public static SpriteBatch batchCyan;
	public static Texture cyanMonsterRight,cyanMonsterLeft;
	public static boolean isCyanRightPng = true;
	public static boolean isCyanLeftPng = false;
	public static float cyanWidthPng = 40;
	public static float cyanHeightPng = 35;


	public static SpriteBatch batchCyanFri;
	public static Texture cyanMonsterRightFri,cyanMonsterLeftFri;
	public static boolean isCyanRightPngFri = true;
	public static boolean isCyanLeftPngFri = false;


	public static SpriteBatch batchCyanEaten;
	public static Texture cyanMonsterRightEaten,cyanMonsterLeftEaten;
	public static boolean isCyanRightPngEaten = true;
	public static boolean isCyanLeftPngEaten = false;
	public static float cyanWidthPngEaten = 38;
	public static float cyanHeightPngEaten = 43;


    //orange
	public static SpriteBatch batchOrange;
	public static Texture orangeMonsterRight,orangeMonsterLeft;
	public static boolean isOrangeRightPng = true;
	public static boolean isOrangeLeftPng = false;
	public static float orangeWidthPng = 40;
	public static float orangeHeightPng = 35;


	public static SpriteBatch batchOrangeFri;
	public static Texture orangeMonsterRightFri,orangeMonsterLeftFri;
	public static boolean isOrangeRightPngFri = true;
	public static boolean isOrangeLeftPngFri = false;


	public static SpriteBatch batchOrangeEaten;
	public static Texture orangeMonsterRightEaten,orangeMonsterLeftEaten;
	public static boolean isOrangeRightPngEaten = true;
	public static boolean isOrangeLeftPngEaten = false;
	public static float orangeWidthPngEaten = 38;
	public static float orangeHeightPngEaten = 43;



	public static float orangeGhostXInitial = (16*cellWidth),orangeGhostYInitial=(20*cellHeight)-(3*cellHeight);
	public static float orangeGhostX=orangeGhostXInitial,orangeGhostY=orangeGhostYInitial;

	public static float orangeGhostScatterX = 29*cellWidth;
	public static float orangeGhostScatterY = 0;

	public static boolean orangeGhostEatenMode = false;
	public static boolean orangeGhostScatterModeOn = false;
	public static boolean orangeGhostChaseModeOn = false;
	public static boolean orangeGhostFrightenedModeOn = false;

	public static long timeElapsedForPauseToMovementOrangeMonster = 0;
	public static long timeElapsedForModeChangeOrangeMonster = 0;



	public static float orangeGhostRadius = 9;
	public static float orangeGhostMove= arcMove;
	public static boolean orangeGhostMovementOn = false;
	public static boolean orangeRight=false,orangeLeft=false,orangeUp=false,orangeDown=false;



	public static long timeDurationOfGhostFrightenedModeOrangeMonster = 0;
	public static boolean directionChangedOnFrightenedModeOrange = false;
	public static boolean isDirectionChangedOnEatenModeOrange = false;
	public static boolean orangeGhostSpeedIncreasedAfterEaten = false;
	public static long increasedOrangeGhostSpeedAtEatenMode = 6;

	public static float orangeGhostMoveInitial = redGhostMove;


	public static boolean orangeGhostOutOfGhostHouse = false;
	public static boolean orangeGhostCenterOfGhostHouse = false;
	public static boolean orangeGhostReachedOutOfGhostHouseEatenMode = false;
	public static boolean orangeGhostReachedCenterOfGhostHouseEatenMode = false;


	//for cyan monster


	public static SpriteBatch batchPlayer;
	public static Texture playerMonsterRight,playerMonsterLeft,playerMonsterUp,playerMonsterDown;
	public static boolean isPlayerRightPng = true;
	public static boolean isPlayerLeftPng = false;

	public static boolean isPlayerUpPng = false;
	public static boolean isPlayerDownPng = false;


	public static float playerWidthPng = 30;
	public static float playerHeightPng = 26;




	Music music,musicGamePlayScreen;
	public static Texture texture,textureBig;
    public static Sprite sprite,spriteBig;


	//starting screen
	public static SpriteBatch startingScreenBatch,menu,yourScore;
	public static Texture startingScreenImg,menuImg,menuImg2,sideImg,yourScoreImg,allCoinsEaten;
	public static float timeElapsed=0f;



	public static int amiOn = 0 ;
	public static BitmapFont font;
	public static long score = 0;

	public static long perCoinScore = 10;


	public  static long totalLife = 3;

	public static long musicOn = 1;
	public static long musicGameScreen = 1;

	public static long numberOfCoins = 246;

	public static long menuStart = 1;
	public static Texture[] scoreDigit = new Texture[10];

	public static long scoreDigitSize = 55;
	public static long scoreDigitSpace = 0;
	public  static long scoreDigitY = 620-(scoreDigitSize/2);
	public static long scoreDigitXForOne = 1220-(scoreDigitSize/2);
	public static long scoreDigitXForTwo = 1220-( ( (2*scoreDigitSize) + (1*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForThree = 1220-( ( (3*scoreDigitSize) + (2*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForFour = 1220-( ( (4*scoreDigitSize) + (3*scoreDigitSpace)   ) /2 );

    public static Texture[] life = new Texture[3];
	public static long lifeSize = 55;
	public static long lifeSpace = 0;
	public  static long lifeY = 440-(lifeSize/2);
	public static long lifeXForOne = 1220-(lifeSize/2);
	public static long lifeXForTwo = 1220-( ( (2*lifeSize) + (1*lifeSpace)   ) /2 );
	public static long lifeXForThree = 1220-( ( (3*lifeSize) + (2*lifeSpace)   ) /2 );

	public static Texture[] musicOnOffImage = new Texture[2];
	public static long musicOnOffImageSize = 64;
	public  static long musicOnOffImageX = 1220-(musicOnOffImageSize/2);
	public static long musicOnOffImageY = 960-690-(musicOnOffImageSize/2);



	public static Texture[] exitRestartOnGameScreenImage = new Texture[2];
	public static long exitRestartOnGameScreenImageSize = 64;
	public static long exitRestartOnGameScreenImageSpace = 30;
	public  static long  exitRestartOnGameScreenImageX =  1220-( ( (2*exitRestartOnGameScreenImageSize) + (exitRestartOnGameScreenImageSpace)   ) /2 );
	public static long exitRestartOnGameScreenImageY = 960-820-(exitRestartOnGameScreenImageSize/2);



	public static long scoreDigitSizeZeroLife = 55;
	public static long scoreDigitSpaceZeroLife = 0;
	public  static long scoreDigitYZeroLifeY = 960-570-(scoreDigitSize);
	public static long scoreDigitXForOneZeroLife = 700-(scoreDigitSize/2);
	public static long scoreDigitXForTwoZeroLife = 700-( ( (2*scoreDigitSize) + (1*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForThreeZeroLife = 700-( ( (3*scoreDigitSize) + (2*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForFourZeroLife = 700-( ( (4*scoreDigitSize) + (3*scoreDigitSpace)   ) /2 );



	public static Texture[] exitRestartOnGameScreenImageZeroLife = new Texture[2];
	public static long exitRestartOnGameScreenImageSizeZeroLife = 64;
	public static long exitRestartOnGameScreenImageSpaceZeroLife = 30;
	public  static long  exitRestartOnGameScreenImageXZeroLife =  700-( ( (2*exitRestartOnGameScreenImageSizeZeroLife) + (exitRestartOnGameScreenImageSpaceZeroLife)   ) /2 );
	public static long exitRestartOnGameScreenImageYZeroLife = 960-690-(exitRestartOnGameScreenImageSizeZeroLife/2);




	public static long scoreDigitSizeCoinsEaten = 55;
	public static long scoreDigitSpaceCoinsEaten = 0;
	public  static long scoreDigitYCoinsEatenY = 960-570-(scoreDigitSize);
	public static long scoreDigitXForOneCoinsEaten= 700-(scoreDigitSize/2);
	public static long scoreDigitXForTwoCoinsEaten = 700-( ( (2*scoreDigitSize) + (1*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForThreeCoinsEaten = 700-( ( (3*scoreDigitSize) + (2*scoreDigitSpace)   ) /2 );
	public static long scoreDigitXForFourCoinsEaten = 700-( ( (4*scoreDigitSize) + (3*scoreDigitSpace)   ) /2 );


	public static Texture[] exitRestartOnGameScreenImageCoinsEaten = new Texture[2];
	public static long exitRestartOnGameScreenImageSizeCoinsEaten = 64;
	public static long exitRestartOnGameScreenImageSpaceCoinsEaten = 30;
	public  static long  exitRestartOnGameScreenImageXCoinsEaten =  700-( ( (2*exitRestartOnGameScreenImageSizeCoinsEaten) + (exitRestartOnGameScreenImageSpaceCoinsEaten)   ) /2 );
	public static long exitRestartOnGameScreenImageYCoinsEaten = 960-690-(exitRestartOnGameScreenImageSizeCoinsEaten/2);



	@Override
	public void create () {

		batch = new SpriteBatch();
		img = new Texture("fullScreen2.jpg");

		batchRed = new SpriteBatch();
		redMonsterRight = new Texture("red/redRight.png");
		redMonsterLeft = new Texture("red/redLeft.png");

		batchRedFri = new SpriteBatch();
		redMonsterRightFri = new Texture("fri/friRightt.png");
		redMonsterLeftFri = new Texture("fri/friLeftt.png");

		batchRedEaten = new SpriteBatch();
		redMonsterRightEaten = new Texture("eaten/eatenRight.png");
		redMonsterLeftEaten = new Texture("eaten/eatenLeft.png");



		batchPink = new SpriteBatch();
		pinkMonsterRight = new Texture("pink/pinkRight.png");
		pinkMonsterLeft = new Texture("pink/pinkLeft.png");

		batchPinkFri = new SpriteBatch();
		pinkMonsterRightFri = new Texture("fri/friRightt.png");
		pinkMonsterLeftFri = new Texture("fri/friLeftt.png");

		batchPinkEaten = new SpriteBatch();
		pinkMonsterRightEaten = new Texture("eaten/eatenRight.png");
		pinkMonsterLeftEaten = new Texture("eaten/eatenLeft.png");


		batchCyan = new SpriteBatch();
		cyanMonsterRight = new Texture("cyan/cyanRight.png");
		cyanMonsterLeft = new Texture("cyan/cyanLeft.png");

		batchCyanFri = new SpriteBatch();
		cyanMonsterRightFri = new Texture("fri/friRightt.png");
		cyanMonsterLeftFri = new Texture("fri/friLeftt.png");

		batchCyanEaten = new SpriteBatch();
		cyanMonsterRightEaten = new Texture("eaten/eatenRight.png");
		cyanMonsterLeftEaten = new Texture("eaten/eatenLeft.png");



		batchOrange = new SpriteBatch();
		orangeMonsterRight = new Texture("orange/orangeRight.png");
		orangeMonsterLeft = new Texture("orange/orangeLeft.png");

		batchOrangeFri = new SpriteBatch();
		orangeMonsterRightFri = new Texture("fri/friRightt.png");
		orangeMonsterLeftFri = new Texture("fri/friLeftt.png");

		batchOrangeEaten = new SpriteBatch();
		orangeMonsterRightEaten = new Texture("eaten/eatenRight.png");
		orangeMonsterLeftEaten = new Texture("eaten/eatenLeft.png");



		batchPlayer = new SpriteBatch();
		playerMonsterRight = new Texture("player/pacRight.png");
		playerMonsterLeft = new Texture("player/pacLeft.png");
		playerMonsterUp = new Texture("player/pacUP.png");
		playerMonsterDown = new Texture("player/pacDown.png");



		music = Gdx.audio.newMusic(Gdx.files.internal("music/gameScreen.ogg"));
	   music.setLooping(true);
	   music.setVolume(0.9f);

	   musicGamePlayScreen = Gdx.audio.newMusic((Gdx.files.internal("music/music.ogg")));
	   musicGamePlayScreen.setLooping(true);
	   music.setVolume(0.9f);



		texture = new Texture("coins/coins6.png");
		sprite = new Sprite(texture,15,15);
		sprite.setOrigin(15/2,15/2);

		textureBig = new Texture("coins/coins4.png");
		spriteBig = new Sprite(textureBig,20,20);
		spriteBig.setOrigin(20/2,20/2);

		shapeRenderer = new ShapeRenderer();
		for(int i=0;i<30;i++)
		{
			for(int j=0;j<32;j++){
				if(coins[i][j]==1) noteEatenCoins[i][j]=1;
			}
		}

       // staring screen
		startingScreenBatch = new SpriteBatch();
		startingScreenImg = new Texture("startScreenMain8.jpg");
		menuImg = new Texture("menu4.jpg");
		menuImg2 = new Texture("menu5.jpg");
		sideImg = new Texture("bar2.jpg");
		yourScoreImg = new Texture("lifeended2.jpg");
		allCoinsEaten = new Texture("allCoinsEaten2.jpg");

		//for score writing
		menu = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.RED);
		font.getData().setScale(2,2);



		scoreDigit[0]= new Texture("ScoreDigit/zero.png");
		scoreDigit[1]= new Texture("ScoreDigit/one.png");
		scoreDigit[2]= new Texture("ScoreDigit/two.png");
		scoreDigit[3]= new Texture("ScoreDigit/three.png");
		scoreDigit[4]= new Texture("ScoreDigit/four.png");
		scoreDigit[5]= new Texture("ScoreDigit/five.png");
		scoreDigit[6]= new Texture("ScoreDigit/six.png");
		scoreDigit[7]= new Texture("ScoreDigit/seven.png");
		scoreDigit[8]= new Texture("ScoreDigit/eight.png");
		scoreDigit[9]= new Texture("ScoreDigit/nine.png");


		life[0] = new Texture("life/life.png");
		life[1] = new Texture("life/life.png");
		life[2] = new Texture("life/life.png");

		musicOnOffImage[0] = new Texture("music/musicOn.png");
		musicOnOffImage[1] = new Texture("music/musicOff.png");

		exitRestartOnGameScreenImage[0] = new Texture("exit.png");
		exitRestartOnGameScreenImage[1] = new Texture("restart.png");


	//	Image image = new com.badlogic.gdx.scenes.scene2d.ui.Image("exit.png");




	}

	@Override
	public void render () {

		Gdx.input.setInputProcessor((InputProcessor) this);//clears screen
        startingScreenBatch.begin();
		startingScreenBatch.draw(startingScreenImg,0,0);
		startingScreenBatch.end();
		timeElapsed += Gdx.graphics.getDeltaTime();//time with perspective of screen frame
		if(amiOn==2){music.pause();
			if(musicGameScreen==1)musicGamePlayScreen.play();
			else musicGamePlayScreen.pause();
		}
		else {
			music.play();
			musicGamePlayScreen.stop();
		}


		//else if(amiOn ==2 && musicOn==0) music.pause();

		if(timeElapsed>=3f) {
           // if(numberOfCoins==240) amiOn = 4;
			if(amiOn==0)amiOn = 1;
			if(amiOn==1) {HomeMenu homeMenu = new HomeMenu();}
			if(amiOn==2) {GamePlayScreen gamePlayScreen = new GamePlayScreen();
				if(numberOfCoins==0){
					amiOn = 4;
				}
			}
			if(amiOn==3) {
				YourScore yourScore1 = new YourScore();
			}
			if(amiOn==4){
				AllCoinsEaten allCoinsEaten1 = new AllCoinsEaten();
			}

			//GamePlayScreen gamePlayScreen = new GamePlayScreen();
		}





			//marioY -= Gdx.graphics.getDeltaTime() * marioSpeed;
		//System.out.println(menuStart);
	}



	@Override
	public void dispose () {//shows the objects drew
		batch.dispose();
		img.dispose();
		shapeRenderer.dispose();
		batchRed.dispose();
		music.dispose();
		startingScreenBatch.dispose();
		font.dispose();

	}

	@Override
	public boolean keyDown(int keycode) {
		//System.out.println(Keys.va);

			   if(menuStart==0) menuStart = 1;
			   else menuStart = 0;



		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		return false;
	}

	@Override
	public boolean keyTyped(char character) {

		if(amiOn==1)
		{
			//if(character == 'e') { System.exit(0); }
			//if(character == 'p') {amiOn = 2;}
			if(character=='\n')
			{
				if(menuStart==0) {amiOn=2;}
				else System.exit(0);
			}

		}
		else if(amiOn==2) {
			if (playerMovementOn) {
				PlayerDirectionCommandStore pacdisto = new PlayerDirectionCommandStore(character);
			}


			 if(character == 'i'){
				SetAllVariablesRestart setAllVariablesRestart = new SetAllVariablesRestart();
			}
			 if(character == 'o'){ // music image toggle
				if(musicGameScreen ==1) musicGameScreen = 0;
				else musicGameScreen = 1;
			}
		}
		else if(amiOn==3)
		{
			if(character == 'i'){
				amiOn = 2;
				musicOn = 1;

				score = 0;
				SetAllVariablesRestart setAllVariablesRestart = new SetAllVariablesRestart();
				musicGameScreen = 1;
			}

		}

		else if(amiOn==4){
			if(character=='i'){
				amiOn = 2;
				score  = 0;
				musicOn = 1;
				SetAllVariablesRestart setAllVariablesRestart = new SetAllVariablesRestart();
				musicGameScreen = 1;

			}

		}

		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
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
}
