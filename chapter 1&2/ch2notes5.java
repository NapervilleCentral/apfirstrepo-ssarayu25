    /********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Name
//Date
//Program
//Description
//Who helped me: Mr. Hayes
//this is the package
import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class



import java.util.*;  // let me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;



public class ch2notes5

{   enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}




public static void main (String[] args)
{
    //Scanner scan = new Scanner (System.in);
    Scanner Keyboard = new Scanner(System.in);

    //Flavor cone = Flavor.razberry;

    //these are basic data types
        int length;
        int x = 9,y,z;
        int id = 789;
        double num = 5, num1 = 23.89765, num2 = 3.4;
        char letter = 'd';
        boolean choice = false;

        //These are Objects
        Integer number = new Integer(47);
        String myname = new String("Kevin Hayes");
        Integer n2 = 7;//Auto Boxing
/* */
        String word = new String("Homer Simpson");
        String word2 = new String("Homer Simpson");
        String word3 = new String("Bart Simpson");
        String name = new String();
        //string is special other classes/objects can't do this
        String last = "Hayes";
    //    System.out.println(word.length());
      //  System.out.println("the name is " + name);
/* 
        System.out.printf("Name:  %s \t ID: %5d \n", name,id);
        System.out.println( 'a' + 100 ); // chars are ints
        System.out.println('a'   );
        System.out.println("A"+100);
        System.out.println("The add is "+ (7 + 5));
        System.out.println(7 + 5 + " is the add");
*/
//      System.out.printf(  );

//      System.out.printf( );

        System.out.println(  );

    System.out.println( );
    System.out.println(  );



        num1 = 23.89765; num2 = 3.4;
//Your create a NumberFormat and Decimalformat object

/*
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        DecimalFormat fmt =new DecimalFormat("0.###"); // max round floats
        DecimalFormat fmt2= new DecimalFormat("0.0000");// ## vs 00
        

        System.out.println( "Sub Total: " + money.format(num1) );
        System.out.println( "Sub Total: " + percent.format(.5) );
        System.out.println( "Sub Total: " + fmt.format(num1) );
        System.out.println( "Sub Total: " + fmt2.format(num2) ); // pads with 0s 
        
        System.out.println( "Sub Total: " + fmt.format(num2) );
        System.out.println( "Sub Total: " + fmt2.format(num1) );
*/
// page 90 Why do we get this Error???
/*
        System.out.print("Enter a number ");
        x = Keyboard.nextInt   ();
        System.out.println(x  );
        System.out.println("Enter a word ");
        Keyboard.nextLine ();
        word = Keyboard.next   ();
        word = Keyboard.nextLine   ();
        


        System.out.print("Enter 3 numbers");
        x = Keyboard.nextInt   ();
        y = Keyboard.nextInt   ();
        z = Keyboard.nextInt   ();
        num = Keyboard.nextDouble ();
        System.out.println(x + " "+" " + y + " " + z  );
*/

        // what happens when you have both of these together
/* 
        System.out.println("Enter a word");
        word = Keyboard.next(); // next is until the next white space, while next line is the next line
       // word = Keyboard.nextLine();
        System.out.println(word  );

/*      System.out.println( "enter a word" );
        word = Keyboard.nextLine();
        System.out.println(word  );
/*
        System.out.print("Enter a word "  );
        word = Keyboard.next   ();
        lname = Keyboard.next();
        System.out.println(word + "\n" + lname  );



/* 
//  Can we make a Math Object? What type of class is Math???
  //    Math silly = new Math(); // do not make objects from static classes 
      //pg 88 

        System.out.println(Math.abs(-4)); // returns a number 
        System.out.println(Math.sqrt (12));
        System.out.println(Math.pow(2,3));
//      System.out.println(silly.pow(2,4));


/* 
//!!!!!!!!!!!! Make a Random Object called generator
        Random generator = new Random();
     // 100 numbers from 0-99
        x = generator.nextInt(100);
        System.out.println("the Random number is " + x);
     // decimal of 17 digits 0 - 1 exculsive
        num =generator.nextDouble()*50;
        System.out.println(num);
        num =Math.random()* 100 - 50;
        System.out.println(num);
        /*

/**/
//----------------------------Know it live it love it p 78
        //word is an oject can do things (NOT len(word))
        System.out.println(  word.length() );
        System.out.println(word == word2 );
        System.out.println(word.equals(word2));
        System.out.println( x == 9 );
        System.out.println(  word.compareTo(word3 ));
        System.out.println(  word.indexOf("p"));
        //slice up string - substring
        //substring(index returns string from index to end
        System.out.println(  word.substring(word.indexOf("r")));
        //substrin(start, end);
        int find = word.indexOf("S");
        System.out.println(   word.substring(find,find+2));






//System.out.println((int)(letter + letter ) );

    //System.out.println( (char)101 );
/*
x = 9;
y = 5;
   // double conversionFactor = 9.0/5; //9/5 logic error -- promotion changing 9 to 9.0 (int to double)
    double conversionFactor = (double)x/y; // casting (temporarily widening data type)
    System.out.println(conversionFactor); // int/int = int
     final int BASE = 32;            // cast is (data type)
      int celsiusTemp = 30;

        double fahrenTemp = celsiusTemp * conversionFactor + BASE;

        System.out.println("Celsius Temp: " + celsiusTemp );
        System.out.println("Fahrenheit Equivalent" + fahrenTemp  );
  
        System.out.println((int)(Math.random() * 100));
/*
    num = num + num;
    num = num - num;
    num = num * num;
    num = num / num;
    num = num % 3;
    System.out.println(num);



/**/

}//end of main

}//end of class
