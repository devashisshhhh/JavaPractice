package org.example;
import java.util.*;

public class StringBuilders {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb);

        // Character at index
        System.out.println(sb.charAt(0));

        // Set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // Insert character at index
        sb.insert(0, 'S');
        sb.insert(2, 'r');
        System.out.println(sb);

        // Delete at index
        sb.delete(0,2);
        System.out.println(sb);

        // Append
        sb.append("s");
        sb.append("h");
        sb.append("i");
        sb.append("p");
        System.out.println(sb);

        // Reversing the string
        for (int i=0; i<sb.length()/2; i++)
        {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
