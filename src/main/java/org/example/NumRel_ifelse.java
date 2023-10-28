package org.example;
import java.util.*;

public class NumRel_ifelse {
    public static void main(String args[])
    {
        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
        {
            System.out.println("These are equal Numbers.");
        }
        else if (a > b)
        {
            System.out.println("First Number is greater than Second one.");
        }
        else
        {
            System.out.println("Second Number is greater than First one.");
        }
    }
}
