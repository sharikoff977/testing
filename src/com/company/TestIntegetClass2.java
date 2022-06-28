package com.company;

public class TestIntegetClass2{
    public static void main(String[] args) {
        System.out.println( getSum("75", "25"));
    }
    public static int getSum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
