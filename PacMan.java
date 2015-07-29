int sx = 500;
int sy = 500;


void setup(){
	size(sx, sy);
	smooth(); //Draws everything smooth
}
void draw(){
	line(5, 5, 255, 5);
	fill(255, 0, 0);
	triangle(10, 10, 40, 40, 50, 10);
	fill(0, 255, 0);
	quad(100, 100, 130, 100, 160, 180, 50, 180);
	fill(0, 0, 255);
	rect(200, 200, 50, 50);
	ellipse(300, 80, 100, 100);
	fill(255, 255, 0);
	arc(300, 300, 50, 50, .79, 5.5);//PacMan!
}