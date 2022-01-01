package com.sohan;

public class Main {

    public void numbers (int length){
        items = new int[length];
    }
    private int [] items;
    private int count;

    public void insert(int element) {
        // add the new element at the end
        items[count] = element;
        count++;
    }
    public int getMax() {
        // Initialize maximum element
        int max = items[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i =1; i < items.length; i++)
            if (items[i] > max)
                max = items[i];

        return max;

    public static void main(String args []){

        Solution numbers = new Solution(3);
        numbers.insert(5);
        numbers.insert(6);
        numbers.insert(7);
        int result = numbers.getMax();
        System.out.println(result);


    }

}
