package com.company;

class A {
    public static void itStatic() {
        System.out.println("it A");
    }
    protected void that() {
        System.out.println("that A");
    }
}

    class B extends A {
        public static void itStatic() {
            System.out.println("it B");
        }
        @Override
        public void that() {
            System.out.println("that B");
        }
        public void test(){
            System.out.println("test");
        }
}
public class TestStatic {
    public static void main(String[] args) {
                        A a = new A();
                        a.itStatic();// it a
                        a.that();// that A

                        A aa = new B();
                        aa.itStatic(); // it A
                        aa.that(); // that B

                        B b = new B();
                        b.itStatic(); //it B
                        b.that();// that B
                    }
}
