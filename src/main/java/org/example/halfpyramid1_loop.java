package org.example;
import java.util.*;


public class halfpyramid1_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lines : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            //for spaces
            for(int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
            //for number
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
