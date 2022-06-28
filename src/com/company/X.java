package com.company;

public class X {
    public static void main(String[] args) {
        try {
            System.out.print("A");
            badMethod();
        }
        catch (Exception ex) {
            System.out.print("B");
        }
        catch (Throwable ex1) {
            System.out.print("C");
        }
        finally {
                System.out.print("D");
            }
            System.out.print("E");
    }
            public static void badMethod() {
                throw new Error();
    }
}
