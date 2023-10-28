package org.example;
import java.util.*;

public class Adult_ifelse {
    public static void main(String args[]){
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Welcome to Adulthood");
        }
        else
        {
            System.out.println("Tu Pogo Dekh");
        }
    }
}
