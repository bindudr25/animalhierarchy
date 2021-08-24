package com.animal.bird;

import com.animal.Sayable;
import com.type.Gender;

public class Chicken implements Sayable {
    private Gender gender;

    public Chicken() {
        gender = Gender.FEMALE;
    }

    public Chicken(Gender gender) {
        this.setGender(gender);
    }

    public void say() {
        System.out.println("Cluck, Cluck");
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
