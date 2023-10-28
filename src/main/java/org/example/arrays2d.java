package org.example;
import java.util.*;

public class arrays2d {
    public static void main(String args[])
    {

        // Qs. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // for input
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                System.out.print("Enter the element at [" + i + "," + j + "] : ");
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number for which you want to know the indices: ");
        int x = sc.nextInt();

        //for output
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                if(numbers[i][j] == x){
                    System.out.println("The given number i.e. (" + x + ") is at index [" + i + "," + j + "]");
                }
                //System.out.print(numbers[i][j] + " ");
            }
            //System.out.println();
        }
    }
}
