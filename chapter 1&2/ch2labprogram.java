// Name: Sarayu Suresh
// 9/2/21 and 9/13/21
// Title: Name program
// Input full name, prints first, middle inital, and last on seperate lines 
import java.util.Scanner;

public class ch2labprogram
{
  public static void main (String[] args)
  {
      Scanner Keyboard = new Scanner(System.in);
      
      System.out.println("Enter Full Name: ");
      String name = Keyboard.nextLine();
      
      //splitting name into two parts 
      int find = name.lastIndexOf(" ");
      String lastname = name.substring(find + 1); // contains only last name
      int find2 = name.indexOf(" ");
      String firstname = name.substring(0,(find2 + 2)); // contains first name and middle initial
      
      System.out.println(firstname + ".");
      System.out.print(lastname);


      
      
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
