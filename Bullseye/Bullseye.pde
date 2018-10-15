void setup(){
  size(800,800);
}
void draw(){
  int size = 800;
  for(int i=0; i<20; i++){
    if(i%2==0){
      fill(255,0,0);
    }
    else{
      fill(0,0,0);
    }
      
  ellipse(400,400,size,size);
  
  size-=50;
  }
  }