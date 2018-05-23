
//This is my attempt at a Brick Breaker game. It has multiple balls and also has multiple bricks.
//the balls move and bounce off all the walls of the game arena. 
//Also everything has been added to the game arena which allows it all to be on the same screen. 
// it is 1000 by 1000 and bricks have been put in it accordingly to the frames. 
public class runbricks
{
	public static void main(String[] args)
	{
/*this part of my code makes the several bricks for my game
it also makes the game arena and it assigns it the name arena. It also makes it 1000 by 1000
and adds all my bricks to it and updates the arena when any of my bricks are added. The colour of the bricks are blue 
and also the balls are declared here and assigned coordinates on the gamearena.  */ 
		GameArena arena = new GameArena(1000,1000);

    
    		blocks brick1 = new blocks(500,100, "BLUE");    			
    		brick1.addTo(arena);
		arena.update();
			
		blocks brick2 = new blocks(300,100, "BLUE");			
    		brick2.addTo(arena);
		arena.update();

		blocks brick3 = new blocks(100,100, "BLUE");
    		brick3.addTo(arena);
		arena.update();
		
		blocks brick4 = new blocks(700,100, "BLUE");
    		brick4.addTo(arena);
		arena.update();

		blocks brick5 = new blocks(900,100, "BLUE");
    		brick5.addTo(arena);
		arena.update();
		
		blocks brick6 = new blocks(500,200, "BLUE");
    		brick6.addTo(arena);
		arena.update();
		
		blocks brick7 = new blocks(700,200, "BLUE");
    		brick7.addTo(arena);
		arena.update();

		blocks brick8 = new blocks(300,200, "BLUE");
    		brick8.addTo(arena);
		arena.update();

		blocks brick9 = new blocks(100,200, "BLUE");
    		brick9.addTo(arena);
		arena.update();


		blocks brick10 = new blocks(900,200, "BLUE");
    		brick10.addTo(arena);
		arena.update();
		bricks z = new bricks();
		
		Ball ball1 = new Ball(500,900,10,"PURPLE");
		Ball ball2 = new Ball(500,920,10,"PURPLE");
		Ball ball3 = new Ball(500,940,10,"PURPLE");
		arena.addBall(ball1);
		arena.addBall(ball2);
		arena.addBall(ball3);
		
		arena.update();


	
		double posx1,posy1,posx2,posy2,posx3,posy3;
		double speedofx=-2;
		double speedofy=-8;
		while(true)
		{

			posx1 = ball1.getXPosition();
			ball1.setXPosition(posx1+speedofx);
			if(posx1+speedofx>1000)
				speedofx=-speedofx;
			else if(posx1+speedofx<0)
				speedofx=-speedofx;

			posy1 = ball1.getYPosition();
			ball1.setYPosition(posy1+speedofy);
			if(posy1+speedofy>1000)
				speedofy=-speedofy;
			else if(posy1+speedofy<0)
				speedofy=-speedofy;


		
			posx2 = ball2.getXPosition();
			ball2.setXPosition(posx2+speedofx);
			if(posx2+speedofx>1000)
				speedofx=-speedofx;
			else if(posx2+speedofx<0)
				speedofx=-speedofx;

			posy2 = ball2.getYPosition();
			ball2.setYPosition(posy2+speedofy);
			if(posy2+speedofy>1000)
				speedofy=-speedofy;
			else if(posy2+speedofy<0)
				speedofy=-speedofy;

			posx3 = ball3.getXPosition();
			ball3.setXPosition(posx3+speedofx);
			if(posx3+speedofx>1000)
				speedofx=-speedofx;
			else if(posx3+speedofx<0)
				speedofx=-speedofx;

			posy3 = ball3.getYPosition();
			ball3.setYPosition(posy3+speedofy);
			if(posy3+speedofy>1000)
				speedofy=-speedofy;
			else if(posy3+speedofy<0)
				speedofy=-speedofy;



			

			arena.update();
		}
	}
	
	
	
}



