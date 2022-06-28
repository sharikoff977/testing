package com.company;

public class MyStackPractise<T> {
    private Object d[] = new Object [INITIAL_CAPACITY];
    private static final int INITIAL_CAPACITY = 10;

    private int top = -1;

    public MyStackPractise() {
    }

    public void push(T e) {
        // если есть место, то
        // добавить лемент в массив
        // увеличить переменную - позицию
        // если нет, то скопировать массив в новый с размером 1,5
        // произвести вставку

        if (top >= d.length - 1){

            int currentSize = d.length;
            int newSize = (int) (currentSize * 1.5);
            Object[] temp = new Object[newSize];

            for (int i = 0; i < currentSize; i++){

                temp[i] = d[i];

            }

            d = temp;
            System.out.println("New array with size: " + d.length);

        }

        d[++top] = e;
        System.out.println("Position: " + top + ", value: " + d[top]);

    }

    public T pop() {

        if (top >= 0){
            int position = top--;
            T t = (T) d[position];
            System.out.println("Position: " + position + ", value: " + t);
            return t;

        } else {

            return null;

        }

    }

    public static void main(String[] args) {

        MyStackPractise<String> myStackPractise = new MyStackPractise<>();

        for (int i = 0; i < 11; i++){

            myStackPractise.push(String.valueOf(i));

        }

        for (int j = 0; j < 12; j++){

            System.out.println(myStackPractise.pop());

        }

    }

}