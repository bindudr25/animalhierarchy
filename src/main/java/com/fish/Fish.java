package com.fish;

import com.animal.Swimmable;

public class Fish implements Swimmable {
    String color;
    int size;

    public void swim() {
        System.out.println("I am Swimming");
    }
}
