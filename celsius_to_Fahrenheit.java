import java.util.Scanner;
public class seventh {
  
    public static void main (String[] args){
      
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER CELSIUS :");
    float c=input.nextFloat();
    float f;
    f=(c*9/5)+35;
    System.out.println("Fahrenheit : "+f);
   
    }
    
}
