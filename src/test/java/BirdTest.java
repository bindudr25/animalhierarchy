import com.animal.Bird;
import com.animal.Chicken;
import com.animal.Duck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BirdTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testBirdSing() {
        Bird bird = new Bird();
        bird.sing();
        Assertions.assertEquals("I am singing", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testDuckSay() {
        Duck duck = new Duck();
        duck.say();
        Assertions.assertEquals("Quack, quack", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testDuckSwim() {
        Duck duck = new Duck();
        duck.swim();
        Assertions.assertEquals("I am Swimming", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testChickenSay() {
        Chicken chicken = new Chicken();
        chicken.say();
        Assertions.assertEquals("Cluck, Cluck", outputStreamCaptor.toString()
                .trim());

    }
}