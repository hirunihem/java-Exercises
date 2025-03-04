/*
Create a class called Circle that includes two instance variables: radius (double) and color (String). Your class should have following constructors to initializes the two instance variables.
- A default constructor with no argument with default value of 1.0 and "red", respectively.
- A constructor which takes a double argument for radius.
- A constructor which takes a String argument for color.*/

public class Ls3 {
    public static void main(String[] args) {
     Circle o=new Circle();
        System.out.println(o.r);
        System.out.println(o.c);    
    }  
}

class Circle{
    double r;
    String c;
    
    public Circle(){
        this.r=1.0;
        this.c="red";
    }
    public Circle(double r){
        this.r=r;
        c="0";
    }
    public Circle(String c){
        this.c=c;
        this.r=4;
    }
}
