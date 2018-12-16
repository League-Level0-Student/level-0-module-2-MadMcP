 // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x=100;
    int y=150;
    int s=50;
    int distance;
    void setup() {
      //1. set the size of your sketch
    size(250, 250);
    }
    
    void draw() {
      //2. set the background color of your sketch
      background(#FFFFFF);
      fill(#3DE8FA);
      //3. draw an ellipse. Make sure it fits in the window.
      ellipse(x, y, s, s);
      //5. use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     distance=getDistance(mouseX, mouseY, x, y);
      //7. print the distance variable
     print(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if (distance<s){
        //8b.  set the x and y of the ellipse to a random location on the window
       x=(int)random(0, 250);
       y=(int)random(0, 250);
      }
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
