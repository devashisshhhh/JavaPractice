package org.example;
import java.util.*;

public class numpy1_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            // for spaces
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            // for numbers
            for (int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
