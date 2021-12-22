package com.sohan;

import java.util.Scanner;

public class TrailingZeros {

    static long calculateSpecialCase(long n){
        long power = 25;
        long extraFives = 0;

        while (power <= n){
            extraFives++;
            power = power * 5;
        }//while
        return extraFives;
        // pow (5 , x) <= n
        // pow (5 , 2) <= 100 , pow(5 , 2)<= 100 , pow (5 , 3) <=100
        //2 - 1 = 1
    }

    static long findTrailingZeros(long n) {
        // n is the input.
        // n / 5 - 100 / 5 =20
        long trailingZeros = 0;
        // trailingZeros =  n / 5 + n / 25 + n/125
        for (long i = 5 ; i <= n; i *= 5){
            trailingZeros+= n/i;
        }
        return trailingZeros;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(findTrailingZeros(n));
    }
}
