package com.company;

public class Test {
    public static void main(String[] args){

        int[] arr2 = {1, 2, 3};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            arr2[i] += 5;
        }

            System.out.println();

            for (int element: arr2) {
                System.out.print(element);
            }
            System.out.println();

    }
}
