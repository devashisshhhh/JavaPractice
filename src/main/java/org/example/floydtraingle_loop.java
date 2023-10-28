package org.example;
import java.util.*;

public class floydtraingle_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lines : ");
        int n = sc.nextInt();
        int m = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                    System.out.print(" " + m + " ");
                    m++;
            }
            System.out.println();
        }
    }
}
