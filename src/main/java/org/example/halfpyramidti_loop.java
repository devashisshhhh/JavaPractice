package org.example;

import java.util.Scanner;

public class halfpyramidti_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Stars : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=n-i; j++)
            {
                    System.out.print("   ");
            }
            for (int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
