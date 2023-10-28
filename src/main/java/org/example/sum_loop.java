package org.example;
import java.util.*;

public class sum_loop {
    public static void main(String args[])
    {
        System.out.print("Enter the number unto which you need sum : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum = sum+i;
        }
        System.out.println("The sum of first " + n + " natural number is " + sum +".");
    }
}
