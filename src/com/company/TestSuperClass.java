package com.company;

class Superclass{
    public void call() {
        System.out.println("call from Superclass");
    }
        public void callParent() {
            super.hashCode();
    }
}
            class Subclass extends Superclass {
                @Override
                public void call() {
                    System.out.println("call from Subclass");
                }
                @Override
                public void callParent() { super.call();
                }
}
            public class TestSuperClass{
                public static void main(String[] args) {
                    Subclass a = new Subclass();
                    a.call();
                    a.callParent();
                    Superclass c = new Subclass();
                    c.call();
                    c.callParent();
                }
}
