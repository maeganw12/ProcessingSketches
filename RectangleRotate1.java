int sx = 500;
int sy = 500;

int tX = 0;
int tY = 0;
int count = 1;
float angle = 0.0;


void setup(){
	size(sx, sy);
	//fill(0); //No background color
	smooth(); //Draws everything smooth
	frameRate(20);
}

void draw(){
	System.out.println(count+" tX: "+tX+"  tY: "+tY);
	translate(tX, tY);
	rotate(angle);
	rect(-15, -15, 30, 30);
	angle += 0.1;
	tY++;
	if (count%2 == 0){
		tX ++;
	}
	if (count == 255){
		tX += 25;
		tY = 0;
		count = 0;
	}
	while (tX<150){
		tX++;
	}
	count++;
}