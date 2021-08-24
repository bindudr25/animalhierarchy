package com.butterfly;

import com.animal.Walkable;

public class Catterpillar extends Butterfly implements Walkable , Metamorphosable<AdultButterfly>{

    @Override
    public AdultButterfly metamorphosis() {
        return new AdultButterfly(this);
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
