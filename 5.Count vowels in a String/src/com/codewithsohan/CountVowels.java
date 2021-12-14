package com.codewithsohan;

import java.util.Scanner;

public class CountVowels {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    private static boolean isVowel(char character){
        character = Character.toLowerCase(character);
        if(character == 'a' || character == 'e' || character == 'i' ||
                character == 'o' || character == 'u'){
            return true;
        }//if
        return false;
    }

    // TODO: Implement this method
    static int countVowels(String str) {

        int vowelCounter = 0;

        // loop through the string given
        for(char c : str.toCharArray()){
            //if is vowelCharacter == true
            if (isVowel(c)){
                vowelCounter++;
            }// if
        }// for all character

        return vowelCounter;

    }

}
