package com.company;

class Aa {
    public boolean exists() {
        System.out.println("A");
        return true;
    }
}
        public class TestOperator {
            public static void main(String[] args) {
                Aa a = null;
                if (a == null || !a.exists())
                    System.out.println("B");
                a = new Aa();
                if (a== null && !a.exists())
                    System.out.println("C");
                if (a.exists())
                System.out.println("D");
            }
}
