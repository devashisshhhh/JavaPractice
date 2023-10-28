package org.example;
import java.util.*;

public class butterfly1_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of butterfly : ");
        int n = sc.nextInt();
        //for top part
        for(int i=1; i<=n; i++)
        {
            //for stars left top
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            //for spaces top
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print("   ");
            }
            //for stars right top
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //for bottom part
        for(int i=n; i>=1; i--)
        {
            //for stars left top
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            //for spaces top
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print("   ");
            }
            //for stars right top
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
