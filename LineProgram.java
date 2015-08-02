//Line Program
/*
	Functions Needed:
		-colorChange ---- will cycle through the colors of the rainbow
		-moveLeft    ---- all move functions will move (direction) by 10 px
		-moveRight
		-moveUp
		-moveDown
		-upSideDown  ---- flip the object upside down
		-spawn       ---- adds another object at mouse position 
*/
int timesRan = 0;

int boxSizex  = 500;
int boxSizey  = 500;

int vert1x    = 0;
int vert1y    = 0;
int vert2x    = 0;
int vert2y    = 0;
int vert3x    = mouseX; //mouseX
int vert3y    = mouseY; //mouseY
int vert4x    = 0;
int vert4y    = 0;
int vert5x    = 0;
int vert5y    = 0;
int vert6x    = 0;
int vert6y    = 0;

int rValue    = 0;
int gValue    = 0;
int bValue    = 255;

int moveValue = 10;

void setup(){
	size(boxSizex, boxSizey);
}

void draw(){
	timesRan++;
	if (timesRan%60 == 0){
		spawn();
		System.out.println(mouseX + ", "+mouseY);
	}

	System.out.println(timesRan);
}

void spawn(){
	vert1x = mouseX + 20;
	vert1y = mouseY + 25;
	vert2x = mouseX + 20;
	vert2y = mouseY + 30;
	vert3x = mouseX; //mouseX
	vert3y = mouseY; //mouseY
	vert4x = mouseX;
	vert4y = mouseY + 15;
	vert5x = mouseX + 15;
	vert5y = mouseY + 15;
	vert6x = mouseX + 15;
	vert6y = mouseY + 10;

	beginShape();
	fill (rValue, gValue, bValue);
	vertex(vert1x, vert1y);
	vertex(vert2x, vert2y);
	vertex(vert3x, vert3y);
	vertex(vert4x, vert4y);
	vertex(vert5x, vert5y);
	vertex(vert6x, vert6y);
	endShape();
}