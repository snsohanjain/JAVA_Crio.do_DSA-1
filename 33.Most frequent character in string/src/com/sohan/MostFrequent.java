package com.sohan;

import java.util.Scanner;

public class MostFrequent {
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str , int max)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;


        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)] || (max == count[str.charAt(i)] && str.charAt(i) < result)) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
                //return max;
            }

        }
        String res = String.valueOf(Integer.parseInt((String.valueOf(max))));
        //System.out.println(res);

        String [] arr = { String.valueOf(result) , res};
        //String stt = String.valueOf(Arrays.stream(arr).toList());
        for (String sj : arr){
            System.out.print(sj +" ");
        }
        //System.out.println(Arrays.stream(arr).toList());
        //System.out.println(max);

        return result;
    }

    // Driver Method
    public static void main(String[] args)
    {

        int max = -1;  // Initialize max count
        Scanner sc =new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "Acatwithrabiesgivesthekingforadisease.";

        char result = getMaxOccuringChar(str , max);

        //System.out.println("Max occurring character is : " + result);
        //System.out.println(max);

    }
}
