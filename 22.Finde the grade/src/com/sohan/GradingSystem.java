package com.sohan;

import java.util.Scanner;

public class GradingSystem {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float marks = sc.nextFloat();
        String result = gradingSystem(marks);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String gradingSystem(float marks) {

        // if the marks are less than 0 or greater 100 . return invalid
        if (marks < 0 || marks > 100)
        return "Invalid";

        // if the marks are between 0 and 24 return F
        else if (marks >=0 && marks < 25)
                return "F";
        // if the marks are between 25 and 44 return E
        else if (marks >=25 && marks < 45 )
                return "E";
        // if the marks are between 45 and 49 return D
        else if (marks >=45 && marks < 50)
                return "D";
        // if the marks are between 50 and 59 return C
        else if (marks >=50 && marks < 60)
                return  "C";
        // if the marks are between 60 and 79 return B
        else if (marks >=60 && marks < 80)
                return  "B";
        // if the marks are between 80 and 100 return A
        else
                return "A";

        }

}

