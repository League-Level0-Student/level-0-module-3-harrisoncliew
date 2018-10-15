int y2 = 250;
int x2 = 600;
int x = 200;
int y = 250;
void setup(){
  size(700,700);
}
void draw(){
  background(225,225,232);
  int size = 200;
  for(int i=0; i<29; i++){
    noFill();
     ellipse(x,y,size,size);
  
  size-=7;
  }
 int size2 = 200;
  for(int w=0; w<29; w++) {
    noFill();
     ellipse(x2,y2,size2,size2);
  
  size2-=7;
  
  
  }
  
x+=1;
x2-=1;

}