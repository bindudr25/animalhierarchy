package com.fish;

import com.animal.Swimmable;

public class Dolphin implements Swimmable {

    @Override
    public void swim() {
        System.out.println("I am Swimming");
    }
}
