package com.sohan;

import java.util.Scanner;

public class NumberOfPrimesInRange {
    // driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        // Print display message
        //System.out.printf("\nPrime numbers between %d and %d are: ", l, r , ans);

        int ans = numberOfPrimesInARange(l, r);
        System.out.println(ans);
    }

        // TODO: Implement this method
        static int numberOfPrimesInARange(int l, int r) {
            int i, j, flag;

            // Explicitly handling the cases when a is less than 2
            if (l == 1) {
                System.out.println(l);
                l++;
                if (r >= 2) {
                    System.out.println(l);
                    l++;
                }
            }
            if (l == 2)
                System.out.println(l);

            // MAKING SURE THAT a IS ODD BEFORE WE BEGIN
            // THE LOOP
            if (l % 2 == 0)
                l++;

            // NOTE : WE TRAVERSE THROUGH ODD NUMBERS ONLY
            for (i = l; i <= r; i = i + 2) {

                // flag variable to tell
                // if i is prime or not
                flag = 1;

                // WE TRAVERSE TILL SQUARE ROOT OF j only.
                // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)
                for (j = 2; j * j <= i; ++j) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }

                // flag = 1 means i is prime
                // and flag = 0 means i is not prime
                if (flag == 1)
                    System.out.println(i);
            }
            return i;
        }
}
