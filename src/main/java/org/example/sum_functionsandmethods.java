package org.example;
import java.util.*;

public class sum_functionsandmethods {
    public static int calculateSum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Sum of " + a + " and " + b + " is : ");
        int sum = calculateSum(a, b);
        System.out.print(sum);
    }
}
