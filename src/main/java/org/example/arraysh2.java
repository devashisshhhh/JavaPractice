package org.example;
import java.util.*;

public class arraysh2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the total size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // for input
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + (i+1) + " number : ");
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        // for output
        for(int i=0; i<size; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
