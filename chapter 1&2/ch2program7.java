// Name: Alex Montchik, Sarayu Suresh
// 8/30/21
// Title: Program 2.7
// Entering seconds and print out hours, mins, and seconds

import java.util.Scanner;
public class ch2program7
{
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        int seconds;
        int minutes;
        int hours;
        int secondsleft;
        
        System.out.println("Enter seconds: ");
        seconds = Keyboard.nextInt();
        
        //converting the seconds to hours/min/secs format
        hours = seconds / 3600;
        minutes = (seconds / 60) % 60;
        secondsleft = seconds - hours * 3600 - minutes * 60;
        
        System.out.println("There are " + hours + " hours, " + minutes + " minutes and " + secondsleft + " seconds.");
        
        
    }   
    
    
}
