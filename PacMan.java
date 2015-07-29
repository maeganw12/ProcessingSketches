int sx = 500;
int sy = 500;

int pacX = 50;
int pacY = 50;

void setup(){
	size(sx, sy);
	smooth(); //Draws everything smooth
	frameRate(60);
}
void draw(){
	erase(pacX-1,pacY-1);
	if (pacX == 500){
		pacX  = 0;
		pacY += 50;
	}
	open(pacX, pacY);
	pacX++;

}

void open(int x, int y){
	fill(255, 255, 0);
	arc(x, y, 50, 50, .79, 5.5);
}
void erase(int x, int y){
	strokeWeight(0);
	noFill();
	ellipse(x, y, 50, 50);
}
void closed(int x, int y){
	fill(255, 255, 0);
	ellipse(x, y, 50, 50);
}