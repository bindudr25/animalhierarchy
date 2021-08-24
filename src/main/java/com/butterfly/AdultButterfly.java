package com.butterfly;

public class AdultButterfly extends Butterfly
{
    public AdultButterfly(Catterpillar catterpillar) {
    }
    public void fly() {
        System.out.println("I am flying!");
    }

    @Override
    public void eat() {
        System.out.println("I am eating!");
    }
}
