package org.example;
import java.util.*;

public class functionsandmethods {
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Your typed name is : ");
        printMyName(name);
    }
}
