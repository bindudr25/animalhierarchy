import com.animal.*;
import com.animal.bird.*;
import com.butterfly.Butterfly;
import com.fish.Clownfish;
import com.fish.Dolphin;
import com.fish.Fish;
import com.fish.Shark;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CountingTest {

    @Test
    public void countAnimalsWhichFly(){
        Animal[] animals = new Animal[] {
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Arrays.stream(animals).filter(animal -> animal instanceof Flyable).forEach(animal -> ((Flyable) animal).fly());
        Arrays.stream(animals).filter(animal -> animal instanceof Flyable).count();
        Arrays.stream(animals).filter(animal -> animal instanceof Walkable).forEach(animal -> ((Walkable) animal).walk());
        Arrays.stream(animals).filter(animal -> animal instanceof Singable).forEach(animal -> ((Singable) animal).sing());
        Arrays.stream(animals).filter(animal -> animal instanceof Swimmable).forEach(animal -> ((Swimmable) animal).swim());
    }

}
