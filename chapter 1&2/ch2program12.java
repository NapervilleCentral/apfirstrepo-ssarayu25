// Name: Sarayu Suresh
// 9/2/21
// Title: Program 2.12
// input coins, get value
import java.util.Scanner;
import java.text.DecimalFormat;
public class ch2program12
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Enter quarters: ");
        int quarters = Keyboard.nextInt();
        System.out.println("Enter dimes: ");
        int dimes = Keyboard.nextInt();
        System.out.println("Enter nickels: ");
        int nickels = Keyboard.nextInt();
        System.out.println("Enter pennys: ");
        int penny = Keyboard.nextInt();
        
        //converting to a dollar value
        double total = quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + penny * 0.01;
        
        
        //print and format
        DecimalFormat fmt = new DecimalFormat("$0.##");
        System.out.println("Your total is: " + fmt.format(total));
        
    }
}
