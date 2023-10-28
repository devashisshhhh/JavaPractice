package org.example;
import java.util.*;

public class numpy2_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of pyramid : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            //for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("   ");
            }
            //for number left
            for(int j=i; j>=1; j--)
            {
                System.out.print(" " + j + " ");
            }
            //for number right
            for(int j=2; j<=i; j++)
            {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
