package com.animal.bird;

import com.animal.Animal;
import com.animal.Flyable;
import com.animal.Singable;

public class Bird extends Animal implements Singable, Flyable {
    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
