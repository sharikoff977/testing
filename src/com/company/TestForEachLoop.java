package com.company;

public class TestForEachLoop {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        for (int element: arr1) {
            System.out.print(element);
            element += 5;
        }
            System.out.println();
            for (int element: arr1) {
                System.out.print(element);
            }
                System.out.println();
            }
}
