//size variables for output window
int sizex = 500;
int sizey = 500;

//Variables neccessary for swirls
float angle  = 0.0;
float offset = 250;
float scalar = 2;
float speed  = 0.05;


void setup(){
	size(sizex, sizey); //sets size of output window: Size only reads in ints
	fill(0); //Will not fill the shape drawn;
	smooth(); //Will make shape smooth;
}

void draw(){
	float x = offset + cos(angle)*scalar;
  	float y = offset + sin(angle)*scalar;
  	ellipse(x, y, 2, 2);
  	angle  += speed;
  	scalar += speed;
}