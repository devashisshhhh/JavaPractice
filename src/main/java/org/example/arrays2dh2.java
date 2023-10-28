package org.example;
import java.util.*;

public class arrays2dh2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        // for input
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print("Enter the [" + i + "," + j + "] element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // for output
        System.out.println("The transpose of given matrix is: ");
        for (int j=0; j<columns; j++)
        {
            for (int i=0; i<rows; i++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
