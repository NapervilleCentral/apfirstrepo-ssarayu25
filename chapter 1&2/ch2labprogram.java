// Name: Sarayu Suresh
// 9/2/21
// Title: Name program
// Input full name, prints first, middle inital, and last on seperate lines 
import java.util.Scanner;

public class ch2labprogram
{
  public static void main (String[] args)
  {
      Scanner Keyboard = new Scanner(System.in);
      System.out.println("Enter Full Name: ");
      
      String firstname = Keyboard.next();
      String middlename = Keyboard.next();
      String lastname = Keyboard.next();
   
      String middleinitial = middlename.substring(0,1);
      
      System.out.println(firstname + " " + middleinitial + ".");
      System.out.println(lastname);
      
      
  }

}


//Outputs
//
//Enter Full Name: 
//Suresh Kumar Poopandi
//Suresh K.
//Poopandi
//
//Enter Full Name: 
//Sarayu Alak Suresh
//Sarayu A.
//Suresh
