/*
Create a class called Time that includes three instance variables: hour (int),
minute (int) and second (int). Provide following constructors to initializes the
three instance variables.
- No-argument constructor: Initializes each instance variable to zero.
- Constructor: hour supplied, minute and second defaulted to 0.
- Constructor: hour and minute supplied, second defaulted to 0.
- Constructor: hour, minute and second supplied.
- Constructor: Another Time2 object supplied.
  */

public class Ls3 {
    public static void main(String[] args) {
        Time t=new Time();
        System.out.println(t.h);
        Time t1=new Time();
        System.out.println(t1.m);
        Time t2=new Time();
        System.out.println(t2.s);
    }  
}

class Time{
    int h,m,s;
    
    public Time(){
        this.h=5;
        this.m=4;
        this.s=9;
    }
    
    public Time(int h){
        this.h=h;
        m=5;
        s=5;
    }
    
    public Time(int h,int m){
        this.h=h;
        this.m=m;
        s=3;
    }
    
    public Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
       
}
    
    public Time(Time ob){
        this(ob.h,ob.m,ob.s);
    }

}
