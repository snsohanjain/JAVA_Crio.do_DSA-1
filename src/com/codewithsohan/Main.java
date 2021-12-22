package com.codewithsohan;


import java.util.Scanner;

public class Main {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long ans =  factorial(n);
        System.out.println(ans);

    }


    static long factorial(long n)
    {
        long M = 1000000007;
        long f = 1;

        for (int i = 1; i <= n; i++)
            f = f * i;  // WRONG APPROACH as
        // f may exceed (2^64 - 1)

        return f % M;
    }
}
