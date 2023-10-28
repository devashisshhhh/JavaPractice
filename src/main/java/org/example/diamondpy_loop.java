package org.example;
import java.util.*;

public class diamondpy_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of pyramid : ");
        int n = sc.nextInt();
        //upper half
        for(int i=1; i<=n; i++)
        {
            //for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("   ");
            }
            //for stars top
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--)
        {
            // for spaces
            for(int j=1; j <=n-i; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
