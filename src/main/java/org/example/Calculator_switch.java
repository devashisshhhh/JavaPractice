package org.example;
import java.util.*;

public class Calculator_switch {
    public static void main(String args[])
    {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation: \n1 for Addition \n2 for Substration \n3 for Multiplication \n4 for Division \n5 for Remainder");
        Scanner sc2 = new Scanner(System.in);
        int operator = sc.nextInt();
        switch (operator)
        {
        case 1 :
        System.out.print("Sum of numbers is : ");
        System.out.print(a+b);
        break;
        case 2 :
        System.out.print("Difference of numbers is : ");
        System.out.print(a-b);
        break;
        case 3 :
        System.out.print("Product of numbers is : ");
        System.out.print(a*b);
        break;
        case 4 :
        System.out.print("Division of numbers is : ");
        System.out.print(a/b);
        break;
        case 5 :
        System.out.print("Remainder of number is : ");
        System.out.print(a%b);
        break;
        default:
        System.out.println("Invalid Operator");
        }
    }
}
