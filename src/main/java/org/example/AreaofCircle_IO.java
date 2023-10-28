package org.example;
import java.util.*;

public class AreaofCircle_IO {
    public static void main(String args[])
    {
        System.out.println("Enter the radius of Circle:");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float pi = 3.14F;
        System.out.println("The area of Circle is:");
        double area = pi * rad * rad;
        System.out.println(area);
    }
}
