package com.type;

import com.animal.Cat;
import com.animal.Dog;
import com.animal.Sayable;
import com.animal.bird.Duck;
import com.animal.bird.Rooster;


public class SayingStrategy {
    private Sayable strategy;

    public Sayable getStrategy(String livesWith) {
        switch (livesWith.toUpperCase()) {
            case "DOG":
                strategy = new Dog();
                break;
            case "CAT":
                strategy = new Cat();
                break;
            case "ROOSTER":
                strategy = new Rooster();
                break;
            case "DUCK":
                strategy = new Duck();
                break;
            default:
                break;

        }
        return strategy;
    }
}
