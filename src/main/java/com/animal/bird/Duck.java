package com.animal.bird;

import com.animal.Sayable;
import com.animal.Swimmable;
import com.animal.bird.Bird;

public class Duck extends Bird implements Sayable, Swimmable {

    public void say() {
        System.out.println("Quack, quack");
    }
}
