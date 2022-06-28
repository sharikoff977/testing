package com.company;

public class TestIntegerClass{
    public static void main(String[] args) {
        System.out.println( getSum1("75", "25"));
        System.out.println( getSum3("75", "25"));
    }
    public static Integer getSum1(String a, String b) {
        return Integer.parseInt(a + b);
    }
    public static String getSum3(String a, String b) {
        return Integer.valueOf(a + b).toString();
    }
}
