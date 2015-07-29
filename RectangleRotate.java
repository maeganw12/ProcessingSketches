int sx = 500;
int sy = 500;

float angle = 0.0;


void setup(){
	size(sx, sy);
	//fill(0); //No background color
	smooth(); //Draws everything smooth

}

void draw(){
	translate(mouseX, mouseY);//moves by following the mouse
	rotate(angle);
	rect(-15, -15, 30, 30);
	angle += 0.1;
}