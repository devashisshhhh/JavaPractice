package org.example;
import java.util.*;

public class arrays2dh1 {
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
        System.out.println("The spiral of given matrix is: ");
        int rowstart = 0;
        int rowend = rows - 1;
        int columnstart = 0;
        int columnend = columns - 1;

        // To print spiral order matrix
        while(rowstart <= rowend && columnstart <= columnend)
        {

            //1
            for (int j = columnstart; j <= columnend; j++) {
                System.out.print(matrix[rowstart][j] + " ");
            }
            rowstart++;

            //2
            for (int i = rowstart; i <= rowend; i++) {
                System.out.print(matrix[i][columnend] + " ");
            }
            columnend--;

            //3
            for (int j = columnend; j >= columnstart; j--) {
                System.out.print(matrix[rowend][j] + " ");
            }
            rowend--;

            //4
            for (int i = rowend; i >= rowstart; i--) {
                System.out.print(matrix[i][columnend] + " ");
            }
            columnstart++;
            System.out.println();
        }
    }
}
