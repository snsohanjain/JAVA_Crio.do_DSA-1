package com.sohan;

import java.util.Scanner;

public class SeriesSumI {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = seriesSumI(n);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int seriesSumI(int n) {
        int result = 0;
        // iterate from 1 to n
        for (int i = 1 ; i <= n ; i++){
            // compute 2 * i - 1  and 2 * i + 1 multiply
            int d = 2 * i;
            result = result + (d - 1) * (d + 1);
        }
        return result;
        // initialise a result variable and add it to it
        // return the result;

    }
}
