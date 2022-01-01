package com.codewithsohan;


public class Main {

    // Function to check if a string
    // contains only digits
    public static Object
    onlyDigits(String str, int n)
    {
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0'
                    && str.charAt(i) <= '9') {
                return str;
            }
            else {
                break;
            }
        } return 1;
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "1234s";
        int len = str.length();

        // Function Call
        System.out.println(onlyDigits(str, len));
    }
}
