package org.example;
import java.util.*;

public class Stringsh1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlength = 0;

        for(int i=0; i<size; i++)
        {
            int n=i+1;
            System.out.print("Enter the " + n + " string : ");
            array[i] = sc.next();
            totlength += array[i].length();
        }
        System.out.println("The total length of strings is : " + totlength);
    }
}
