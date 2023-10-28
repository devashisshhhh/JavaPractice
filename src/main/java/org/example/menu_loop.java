package org.example;
import java.util.*;

public class menu_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input;
        do
        {
            System.out.print("Enter your marks (Out of 100) : ");
            int marks = sc.nextInt();
            if (marks >=90 && marks <=100)
            {
                System.out.println("This is good marks.");
            }
            else if (marks >=60 && marks <=89)
            {
                System.out.println("This is also good marks.");
            }
            else if (marks >=0 && marks <=59)
            {
                System.out.println("These marks are good as well.");
            }
            else
            {
                System.out.println("Invalid Input");
            }
            System.out.println("Do you wish to continue? \nPress 1 for Yes and 0 for No");
            input = sc.nextInt();
        }
        while (input==1);
    }
}
