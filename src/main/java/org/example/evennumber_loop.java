package org.example;
import java.util.*;

public class evennumber_loop {
    public static void main(String args[])
    {
        System.out.print("You want to print all even numbers till : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Here are all the even numbers till " + n + " :");
        for(int i = 0; i<=n; i=i+2)
        {
            System.out.println(i);
        }
    }
}
