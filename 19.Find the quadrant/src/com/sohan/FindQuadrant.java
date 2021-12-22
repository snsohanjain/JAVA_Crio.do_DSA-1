package com.sohan;

import java.util.Scanner;

public class FindQuadrant {

    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        int result = findQuadrant(x, y);
        System.out.println(result);

    }

    // TODO: Implement this method
    static int findQuadrant(float x, float y) {
//             y
//       2     |     1
//             |
//       ------|------ x
//             |
//       3     |     4

        // check if x is positive
        if (x > 0){
            // check for y
            if (y > 0)
                // if y  is positive - 1 quadrant
                return 1;
            else
                // if y  is negative - 4 quadrant
                return 4;
        }else {
            // check if x is negative
            if (y > 0)
                // check for y
                // if y  is positive - 2 quadrant
                return 2;
            else
                // if y  is negative - 3 quadrant
                return 3;
        }

        }
}
