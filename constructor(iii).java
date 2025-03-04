/*
  A class called MyPoint, which models a 2D point with x and y coordinates. It contains two instance variables x (int) and y (int).
-A default constructor that construct a point at the default location of (0,0).
-A overloaded constructor that constructs a point with the given x and y coordinates.
-A toString () method that display the point in the format "(x, y)".
-A method called distance (int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates.
   */

public class Ls3 {
    public static void main(String[] args) {
       Mypoint o=new Mypoint(6,1);
        System.out.println(o);
        //o.distance();
        System.out.println(o.distance());
    }    
}
 class Mypoint{
     int x,y;
     public Mypoint(){
         this.x=0;
         this.y=0;
     }
     public Mypoint(int x,int y){
         this.x=x;
         this.y=y;
     }
     public String toString(){
         return("("+x+","+y+")");
     }
      public float distance(){
          float d=x-y;
         return d;
    }
 }
