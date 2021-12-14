package com.codewithsohan;


public class Main {

    public static int findElement(int arr[] , int n , int key){

        for (int i = 0; i < n; i++){
            if (arr[i] == key )
                return  i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40};
        int n = arr.length;

        // using the last element search
        int key = 40;
        int position = findElement(arr,n,key);
        if (position == -1){
            System.out.println("Element was not found");
        }else {
            System.out.println("Element found at a position of " + (position + 1));
        }

    }
}
