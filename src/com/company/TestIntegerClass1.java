package com.company;

class Int {
    int intVal;
    double doubleVal;
    boolean boolVal;
}
    public class TestIntegerClass1 {
        public static void main(String[] args) {
            Int a = new Int();
            System.out.println( a.intVal);
            System.out.println( a.doubleVal);
            System.out.println( a.boolVal);
        }
}