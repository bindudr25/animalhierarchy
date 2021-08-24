package com.animal;

public class Duck extends Bird implements Sayable, Swimmable {

    public void swim() {
        System.out.println("I am Swimming");
    }

    public void say() {
        System.out.println("Quack, quack");
    }
}
