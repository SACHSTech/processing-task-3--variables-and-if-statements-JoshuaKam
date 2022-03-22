import processing.core.PApplet;

public class Sketch extends PApplet {
	int w = 900;
  int h = 900;
	float a = random(0, w);
  float b = random(0, h);
  float c = random(0, w);
  float d = random(0, h);
  float e = random(0, w);
  float f = random(0, h);	
  float g = random(0, w);
  float i = random(0, h);
  float j = random(0, w);
  float k = random(0, h);
  float l = random(0, w);
  float m = random(0, h);
  float n = random(0, w);
  float o = random(0, h);
  float p = random(0, w);
  float q = random(0, h);
  float r = random(0, w);
  float s = random(0, h);
  float t = random(0, w);
  float u = random(0, h);
 
  
 
  
  
  public void settings() {
	// put your size call here
    size(w, h);
}

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135,206,235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

	  
    


 

    
    //Ground
    if(a >= w/2){
      fill(0,244,0);
   ellipse(a,b,width/40*55,height/40*28);
    }else{
       fill(300,0,0);
   ellipse(a,b,width/40*55,height/40*28);
    }
    

    //Building
    if(c < w/2){
      fill(255,255,0);
    rect(c,d,width/40*30,height/40*15); 
    }else{
      fill(100,200,356);
    rect(c,d,width/40*30,height/40*15);
    }
   

    //flag pole
    if(f < h/2){
 fill(128,128,128);
    rect(e,f,width/width*5,height/40* 10);  
    }else{
      fill(128,100,128);
    rect(e,f,width/width*5,height/40* 10); 
    }
   

    
    //flag
    if(g > w/2){
fill(244,0,0);
    triangle(g,i,j,k,l,m);
    }else{
      fill(0,0,300);
    triangle(g,i,j,k,l,m);
    }
    

    //door
    if(n > h/2){
 fill(165,42,42);
    rect(n,o,width/200*16,height/200*34);
 }else{
   fill(300,65,42);
    rect(n,o,width/200*16,height/200*34);
}
   if(p > w/4){
fill(	255, 165, 0);
    ellipse(p,q,width/80*15,height/80*15);
   }else{
     fill(57, 83, 398);
    ellipse(p,q,width/80*15,height/80*15);
   }
    

    //Windows
    if(r < w/8){
 fill(255,255,255);
    rect(r,s,width/40*4,height/40*4);
    }else{
      fill(104,37,43);
    rect(r,s,width/40*4,height/40*4);
    }
   
    if(u > h/45){
      fill(255,255,255);
rect(t,u,width/40*4,height/40*4);
    }else{
    fill(209,41,78);
rect(t,u,width/40*4,height/40*4);


    }
    

    int m2 = minute();  // Values from 0 - 59
    int h3 = hour();    // Values from 0 - 23
    int y2 = 200;
    int y1 = 200;
    textSize(10);
    text(m2, 200, m2, y2);
    text(h3, 100, h3, y1);

  }
  
  // define other methods down here.
}