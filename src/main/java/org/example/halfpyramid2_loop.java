package org.example;
import java.util.*;

public class halfpyramid2_loop {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
