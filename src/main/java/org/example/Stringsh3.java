package org.example;
import java.util.*;

public class Stringsh3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mail id: ");
        String mail = sc.next();
        String username = "";

        for(int i=0; i<mail.length();i++)
        {
           if(mail.charAt(i) == '@')
           {
               break;
           }
           else
           {
               username += mail.charAt(i);
           }
        }
        System.out.println("Your username is: " + username);
    }
}
