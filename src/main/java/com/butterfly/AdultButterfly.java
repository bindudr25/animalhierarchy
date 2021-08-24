package com.butterfly;

import com.animal.Flyable;

public class AdultButterfly extends Butterfly implements Flyable
{
    public AdultButterfly(Catterpillar catterpillar) {
        System.out.println("metamorphosising!");
    }
    public void fly() {
        System.out.println("I am flying!");
    }

    @Override
    public void eat() {
        System.out.println("I am eating!");
    }
}
