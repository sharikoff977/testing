package com.company;

import java.util.Arrays;

public class TestSortPractise {

    public static void main(String[] args) {
        int[] array = {7, 1, 3, -2, 12, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

        public static void sort(int[] array) {

            // поиск индекса числа, которое больше от предыдущего
            // найти позицию, где оно будет меньше предыдущего
            // если это нулевая позиция, то поставить в начало списка
            // а все остальные переместить вправо на одну позицию
            for (int i = 1; i < array.length; i++){

               if (array[i - 1] < array[i]){

                   int rightPosition = i;
                   int leftPosition = i;
                   boolean targetPosition = false;
                   while (!targetPosition){
                        targetPosition = true;
                       if (array[leftPosition - 1] < array[rightPosition]){

                           --leftPosition;
                           targetPosition = false;
                           if (leftPosition == 0){
                               targetPosition = true;
                           }

                       }

                   }

                   for (int j = rightPosition; j > leftPosition; j--){

                       int temp = array[j];
                       array[j] = array[j - 1];
                       array[j - 1] = temp;

                       System.out.println(Arrays.toString(array));

                   }

               }

            }

        }

}
