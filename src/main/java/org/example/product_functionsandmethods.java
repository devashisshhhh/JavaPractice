package org.example;
import java.util.*;

public class product_functionsandmethods {
    public static int calculateProduct(int a, int b)
    {
        //int product = a*b;
        return a*b;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Product of " + a + " and " + b + " is : " + calculateProduct(a, b));
        //System.out.print(calculateProduct(a, b));
        //System.out.print(product);
    }
}
