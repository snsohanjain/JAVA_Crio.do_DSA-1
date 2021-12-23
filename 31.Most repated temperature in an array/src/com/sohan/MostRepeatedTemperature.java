package com.sohan;

import java.util.HashMap;
import java.util.Scanner;

public class MostRepeatedTemperature {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int mostRepeatedTemperature(int n, int a[]) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int maxTemprature = a[0];

        for (int i = 0; i < n; i++){

            if (!map.containsKey(a[i]))
            {
                map.put(a[i],0);
            }
            //here
            int existingCount = map.get(a[i]);
            map.put(a[i],existingCount+1);

            if (existingCount+1 > map.get(maxTemprature))
            {
                maxTemprature = a[i];
            }
            else if (existingCount+1 == map.get(maxTemprature))
            {
                if(a[i] > maxTemprature)
                {
                    maxTemprature = a[i];
                }
            }
        } return maxTemprature;

    }
}





//
//    Problem Description
//    Given an array of temperatures, find the temperature that has been repeated the maximum number of days.
//
//        Input format
//        There are two lines of input.
//
//        First line contains an integer N, the number of days.
//
//        Next line contains N space separated integers, the temperature of each day.
//
//        Output format
//        Print the temperature which has occured most number of times. If two temperatures have occured the same number of times print the one which is higher.
//
//        Sample Input 1
//        5
//
//        -10 11 15 20 11
//
//        Sample Output 1
//        11
//
//        Constraints
//        1 <= N <= 100
//
//        -30 <= A[i] <= 50