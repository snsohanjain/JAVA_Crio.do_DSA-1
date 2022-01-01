package com.sohan;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ReduceArray {
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int reduceArray(int n, int a[]){

        PriorityQueue<Integer>maxHeap = new PriorityQueue<>();

        for(int i =0; i < a.length;i++)
            maxHeap.add(a[i]);

        int count = a.length-1;

        while (a.length-1)
        {
            int largest = maxHeap.peek();
            maxHeap.remove();
            int secondLargest = maxHeap.peek();
            maxHeap.remove();

            int d = largest-secondLargest;

            maxHeap.add(d);
        }
        return maxHeap.peek();


    }
}
