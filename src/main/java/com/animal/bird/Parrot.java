package com.animal.bird;

import com.animal.Sayable;
import com.type.SayingStrategy;

public class Parrot implements Sayable {

    public Parrot(){
        livesWith("DOG");
    }

    Sayable sayingStrategy;

    public void livesWith(String livesWith) {
        sayingStrategy = new SayingStrategy().getStrategy(livesWith);
    }

    public void say() {
        sayingStrategy.say();
    }
}
