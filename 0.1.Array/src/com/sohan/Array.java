package com.sohan;

import java.util.Arrays;

public class Array {
    public static void main(String args []){

        int [] sa = {5, 4 , 8 , 7 , 8 , 6 , 44 , 55 , 22 , 33 , 11 , 44 , 66, 21 , 1 , 11, 42, 21, 33, 32, 55,};
        Arrays.sort(sa);
        for (int s : sa){
            System.out.println(s);
        }
        String [] st  = {"one", "two", "three", "four","five"};
        Arrays.sort(st);
        for (String a : st){
            System.out.println(a);
        }
    }

}
