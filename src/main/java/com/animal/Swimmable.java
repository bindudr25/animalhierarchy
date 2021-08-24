package com.animal;

public interface Swimmable {
    default void swim() {
        System.out.println("I am Swimming");
    }
}
