package com.driver;

// Task 1
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2
class B extends A {
    // Task 4
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3
        B b = new B();
        System.out.println(b.meth());
    }
}