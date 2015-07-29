int sx = 500;
int sy = 500;

int pacX = 50;
int pacY = 50;

void setup(){
	size(sx, sy);
	smooth(); //Draws everything smooth
	frameRate(15);
}
void draw(){
	fill(255, 255, 0);
	if (pacX == 500){
		pacX  = 50;
		pacY += 50;
	}
	arc(pacX, pacY, 50, 50, .79, 5.5);//PacMan!
	ellipse(pacX, pacY, 50, 50);

}