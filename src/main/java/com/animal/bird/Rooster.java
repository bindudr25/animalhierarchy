package com.animal.bird;

import com.animal.Sayable;
import com.type.Gender;

public class Rooster extends Chicken implements Sayable {
    public Rooster() {
        super(Gender.MALE);
    }

    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }
}
