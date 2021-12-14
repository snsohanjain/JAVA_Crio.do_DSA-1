package com.sohan;

import java.util.Scanner;

public class reversInteger {
    public static int reversNum(int n){

        int result = 0;

        while ( n > 0){
            int d = n % 10;
            result = result * 10 + d;
            n = n / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int reversInteger = reversNum(n);

        System.out.println(reversInteger);

    }


}
