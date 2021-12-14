package com.codewithsohan;

import java.util.Locale;
import java.util.Scanner;

public class Capatalise {

    public static void main(String args[]) {

        // getting the input of string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        // it can be use when it's time to convert capatalise letter in to the lowercase
        //Convert that String into the lowerCase
       // str = str.toLowerCase(Locale.ROOT);

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str) {

        StringBuffer s = new StringBuffer();

        // Declare a character of space
        // To identify that the next character is the starting
        // of a new word

        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {

            // If previous character is space and current
            // character is not space then it shows that
            // current letter is the starting of the word
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }

        // Return the string with trimming
        return s.toString().trim();
    }

}
