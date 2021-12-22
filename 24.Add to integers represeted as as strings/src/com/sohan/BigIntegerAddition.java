package com.sohan;

import java.util.Scanner;

public class BigIntegerAddition {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    static int digitAt(String num, int positionStartingFromLsb){
        if (positionStartingFromLsb > num.length() - 1){
            return 0;
        }
        return num.charAt(num.length()-positionStartingFromLsb - 1) - '0';
    }
    //1. String is immutable and passed by  value . which means this function
    // cannot accept String, but should rather use StringBuilder.
    //2. reversedSum
    static void buildDigits(StringBuilder reversedNumber , int digit){
        reversedNumber.append(digit);
    }

    // TODO: Implement this method
    static String bigIntegerAddition(String num1, String num2) {
        // todo ;swap the number so that num1 > num 2
        int carry = 0;
        StringBuilder reversedSum = new StringBuilder();

        for (int i = 0; i < num1.length() || i < num2.length(); i++){
            int sumOfDigits = digitAt(num1 , i) + digitAt(num2 , i) + carry;
            // 814
            //213
               // 7
               // 27
               //027
            buildDigits(reversedSum , sumOfDigits%10);
            carry = sumOfDigits/10;
        }
        // if carry is not 0, then prefix the sum with 1.
        if (carry != 0){
            buildDigits(reversedSum , carry);
        }
        return reversedSum.reverse().toString();
    }
}
