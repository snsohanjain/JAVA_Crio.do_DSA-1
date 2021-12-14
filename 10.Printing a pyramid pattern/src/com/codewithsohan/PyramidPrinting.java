package com.codewithsohan;

import java.util.Scanner;

public class PyramidPrinting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    public static String getStars(int i){
        StringBuilder starBuilder = new StringBuilder();
        if (i == 0){
            System.out.println("This is probably passed by an error");
        }
        for (int j = 0; j < i ; j++){
            if (j != 0){
                starBuilder.append(" ");
            }
            starBuilder.append("*");
        }
       // System.out.println(starBuilder.toString().length());

        return starBuilder.toString();

    }


    // TODO: Implement this method
    public static String[] pyramidPrinting(int n) {
        String [] pyramidStars = new String[n];

        for (int i =0; i < n ; i++){

            pyramidStars [i] = getStars(i + 1);
        }return pyramidStars;

    }

}
