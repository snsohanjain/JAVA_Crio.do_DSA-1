package com.sohan;

import java.util.Scanner;
import java.io.*;

public class DecimalToBaseConversion {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        String result = decimalToBaseConversion(n, b);
        System.out.println(result);
    }
    static char reVal(int num)
    {
        if (num >= 0 && num <= 9)
            return (char)(num + 48);
        else
            return (char)(num - 10 + 65);
    }
    // TODO: Implement this method
    static String decimalToBaseConversion(int n, int b) {
        String s = "";
        // Convert input number is given
        // base by repeatedly dividing it
        // by base and taking remainder
        while (n > 0)
        {
            s += reVal(n % b);
            n /= b;
        }
        StringBuilder ix = new StringBuilder();
        // append a string into StringBuilder input1
        ix.append(s);
        // Reverse the result
        return new String(ix.reverse());
    }
}