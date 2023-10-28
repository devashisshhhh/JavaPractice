package org.example;

import java.util.Scanner;

public class rectanglefill_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of rectangle : ");
        int n = sc.nextInt();
        System.out.print("Enter length of rectangle : ");
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=m; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
