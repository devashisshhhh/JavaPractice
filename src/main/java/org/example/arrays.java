package org.example;
import java.util.*;

public class arrays {
    public static void main(String args[]) {

//        int[] marks = new int[3];
//        marks[0]=97; //Physics
//        marks[1]=98; //Chemistry
//        marks[2]=95; //English
//        int marks[] = {97,98,95};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        // Qs. Take an array as input from the user. Search for a given number x and print the index at which it occurs.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // for input
        for (int i=0; i<size; i++){
            System.out.print("Enter the element to be added at " + i + " index : ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element for which you want to know the location : ");
        int x = sc.nextInt();

        // for output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x){
                System.out.println("Required element i.e. (" + x + ") is found at index : " + i);
            }
        }
    }
}
