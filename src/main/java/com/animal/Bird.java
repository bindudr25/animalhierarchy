package com.animal;

public class Bird extends Animal implements Singable {
    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
