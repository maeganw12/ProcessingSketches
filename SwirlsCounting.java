//size variables for output window
int sizex = 500;
int sizey = 500;

int countSwirls = 0;

//Variables neccessary for swirls
float angle  = 0.0;
float offset = 250;
float scalar = 2;
float speed  = 0.05;
float es1 = 2;
float es2 = 2;


void setup(){
	size(sizex, sizey); //sets size of output window: Size only reads in ints
	fill(0); //Will not fill the shape drawn;
	smooth(); //Will make shape smooth;
}

void draw(){
	countSwirls += 1;
	if (countSwirls>=1000){
		es1+= 0.0005;
		es2+= 0.0005;
	}
	if (countSwirls>=2000){
		es1 += 0.005;
		es2 += 0.005;
	}
	if (countSwirls>= 3000){
		es1 -= 0.0155;
		es2 -= 0.0155;
	}
	if (countSwirls >= 5000){
		es1 = 0;
		es2 = 0;
	}
	float x = offset + cos(angle)*scalar;
  	float y = offset + sin(angle)*scalar;
  	ellipse(x, y, es1, es2);
  	angle  += speed;
  	scalar += speed;
  	System.out.println(x +", "+ y+" Swirls: "+countSwirls);
}
