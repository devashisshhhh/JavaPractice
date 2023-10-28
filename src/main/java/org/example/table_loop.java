package org.example;
import java.util.*;

public class table_loop {
    public static void main (String args[])
    {
        System.out.print("Enter the number for which you need the table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<11; i++)
        {
            System.out.println(n + " times " +  i + " is " + i*n + ".");
        }
    }
}
