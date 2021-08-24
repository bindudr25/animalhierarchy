package com.animal.bird;

import com.animal.Animal;
import com.animal.Sayable;
import com.type.Gender;

public class Rooster extends Animal implements Sayable {
    private final Gender gender;

    public Rooster() {
        gender = Gender.MALE;
    }

    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }

    public Gender getGender() {
        return gender;
    }

}
