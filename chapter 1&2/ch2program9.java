// Name: Sarayu Suresh
// 8/31/21
// Title: Program 2.9
// input radius, prints area and circumference

import java.util.Scanner;
import java.text.DecimalFormat;
public class ch2program9
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        double radius;
        double area;
        double circumference;
        
        System.out.println("Enter radius: ");
        radius = Keyboard.nextInt();
        
        // area
        area = Math.PI *  Math.pow(radius, 2);
        System.out.println("The area is " + area);
        DecimalFormat fmt =new DecimalFormat("0.###");
        
        
        // circumference
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is " + circumference);
        
    }   
    
    
}