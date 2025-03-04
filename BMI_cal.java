import java.util.Scanner;
public class ninth {

    public static void main(String[] args) {
        float w,h,m=0;
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER WEIGHT IN Kg :");
        w=input.nextFloat();
        System.out.print("ENTER HEIGHT IN m :");
        h=input.nextFloat();
        m=w/(h*h);
        System.out.print("BMI = "+m+"\n");
        
        if(m<18.5)
            System.out.println("Underweight");
        else if(18.5<=m && m<=24.9)
            System.out.println("Normal");
        else if(25<=m && m<=29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
    
}
