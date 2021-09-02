// Name: Sarayu Suresh
// 9/2/21
// Title: Program 2.14
// generate random number
import java.util.Random;

public class ch2program14
{
  public static void main (String[] args)
   { 
       Random rand = new Random();

       int num1, num2, num3;

    num1 = rand.nextInt (900) + 100;
    num2 = rand.nextInt (643) + 100;
    num3 = rand.nextInt (9000) + 1000;

    System.out.println(num1+"-"+num2+"-"+num3);
        
        
        
   }
        

}
