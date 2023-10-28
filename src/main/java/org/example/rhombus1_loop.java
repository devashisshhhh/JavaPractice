package org.example;
import java.util.*;

public class rhombus1_loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Rhombus : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            //for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("   ");
            }
            // for stars
            for(int j=1; j<=n; j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
