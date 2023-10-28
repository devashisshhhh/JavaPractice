package org.example;
import java.util.*;

public class pascalstraingle_loop {
    public static void main(String args[])
    {
        int n=5;
        int num;
        for(int i=0; i<n; i++)
        {
            //spaces
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            num=1;
            //for number
            for(int j=0; j<=i; j++)
            {
                System.out.print(num + " ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
