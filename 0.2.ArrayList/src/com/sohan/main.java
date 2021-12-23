package com.sohan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String args []){
        ArrayList<String> list = new ArrayList<String >();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");

        // sorting the ArrayList collections
        Collections.sort(list);

        //printing Array list object
        System.out.println(list + " ");
    }

}
