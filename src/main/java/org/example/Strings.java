package org.example;
import java.util.*;

public class Strings {
    public static void main(String args[])
    {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        */
        /*
        //Concatenation (Joining) & Length
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname + " " + lastname;
        //System.out.println(fullname);
        //System.out.println(fullname.length());

        //charAt
        for(int i=0; i<fullname.length(); i++)
        {
            System.out.println(fullname.charAt(i));
        }
        */
        //Comparing Strings
        /*
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        // String1 == String2 : 0
        // String1 > String2 : +ve
        // String1 < String2 : -ve

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else if (name1.compareTo(name2) > 0) {
            System.out.println("String 1 is larger than String 2.");
        } else if (name1.compareTo(name2) < 0) {
            System.out.println("String 2 is larger than String 1.");
        }
        */
        // Substring Concept
        String sentence = "DevashishSharma";
        String fname = sentence.substring(0, 9);
        String lname = sentence.substring(9, 15);
        System.out.println(fname);
        System.out.println(lname);

    }
}
