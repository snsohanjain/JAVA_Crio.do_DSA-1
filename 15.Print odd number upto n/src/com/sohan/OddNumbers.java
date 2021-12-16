package com.sohan;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbers {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNumbers(n);

        for (int j : result)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static ArrayList<Integer> oddNumbers(int n) {

        // create a list
        ArrayList<Integer> oddNumbersList = new ArrayList<>();
        // iterate from 1 till n
        for (int i = 1; i <=n; i++){
            // check  if the number is divisible 2
            if (i % 2 !=0) {
                // if it is not then add into the list
                oddNumbersList.add(i);
            }
            // return the list
        } return oddNumbersList;


    }
}
