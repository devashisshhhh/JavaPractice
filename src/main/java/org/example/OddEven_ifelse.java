package org.example;
import java.util.*;

import java.util.Scanner;

public class OddEven_ifelse {

        public static void main(String args[]){
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("This is an even number.");
            }
            else
            {
                System.out.println("This is an odd number.");
            }
        }
}

