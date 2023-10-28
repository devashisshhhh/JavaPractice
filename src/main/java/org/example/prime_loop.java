package org.example;
import java.util.*;

public class prime_loop {
    public static void main(String args[])
    {
        System.out.print("Enter the number to check PRIME status : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        for (int i=2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                prime = false;
                break;
            }
        }
        if(prime)
        {
            if (n==1)
            {
                System.out.println("This is neither a prime nor a composite number.");
            }
            else
            {
                System.out.println("This is a prime number.");
            }
        }
        else
        {
            System.out.println("This is not a prime number.");
        }
    }
}
