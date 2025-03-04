import java.util.Scanner;
public class eighth {

    public static void main(String[] args) {
       int a,b;
       Scanner input=new Scanner(System.in);
       System.out.println("ENTER 1ST :");
       a=input.nextInt();
      System.out.println("ENTER 2ND :");
       b=input.nextInt();
       System.out.println("BEFORE SWAP\t:"+a+"\t"+b);
       b=a-b;
       a=a-b;
       b=a+b;
           
       System.out.println("AFTER SWAP\t:"+a+"\t"+b);
    }
    
}
