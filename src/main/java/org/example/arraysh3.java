package org.example;
import java.util.*;

public class arraysh3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the total size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // for input
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " number : ");
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;

        for(int i=0; i<size-1; i++)
        {
            if(numbers[i] > numbers[i+1])
            {
                isAscending = false;
            }
        }
        if (isAscending)
        {
            System.out.println("The array is in Ascending Order.");
        }
        else
        {
            System.out.println("The array is not in Ascending Order.");
        }
    }
}
