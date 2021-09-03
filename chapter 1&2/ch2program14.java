// Name: Sarayu Suresh
// 9/2/21
// Title: Program 2.14
// generate random phone number 
import java.util.Random;
import java.text.DecimalFormat;
public class ch2program14
{
  public static void main (String[] args)
   { 
       Random generator = new Random();

    
    //generate numbers
    int part1 = generator.nextInt (7);
    int part2 = generator.nextInt (7);
    int part3 = generator.nextInt (7);
    int part4 = generator.nextInt (742);
    int part5 = generator.nextInt (9999);
    
    //formatting
    DecimalFormat three = new DecimalFormat("000"); 
    DecimalFormat four = new DecimalFormat("0000"); 
    
    //print output
    System.out.println("Generated Phone Number: " + part1 + part2 + part3 + "-" + three.format(part4) + "-" + four.format(part5));
        
        
        
   }
        

}


// two example outputs
//
//Generated Phone Number: 532-139-9836
//Generated Phone Number: 625-735-0931
