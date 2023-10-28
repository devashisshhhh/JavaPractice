package org.example;
import java.util.*;

public class arrayh1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names to be stored: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // for input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i+1) + " name : ");
            names[i] = sc.next();
        }

        // for output
        for (int i = 0; i < names.length; i++) {
            System.out.println("The name of " + (i + 1) + " is : " + names[i]);
        }
    }
}
