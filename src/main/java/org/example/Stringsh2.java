package org.example;
import java.util.*;

public class Stringsh2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        String result = "";

        for (int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'e')
            {
                result += 'i';
            }
            else
            {
                result += str.charAt(i);
            }
        }
        System.out.println("The changed string is: " + result);
    }
}
