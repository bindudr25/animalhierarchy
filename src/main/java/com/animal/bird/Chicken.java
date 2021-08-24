package com.animal.bird;

import com.animal.Animal;
import com.animal.Sayable;
import com.type.Gender;

public class Chicken extends Animal implements Sayable {
    private Gender gender;

    public Chicken() {
        gender = Gender.FEMALE;
    }

    public Chicken(Gender gender) {
        this.setGender(gender);
    }

    public void say() {
        if (gender.equals(Gender.MALE)) {
            Rooster rooster = new Rooster();
            rooster.say();
        } else {
            System.out.println("Cluck, Cluck");
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
