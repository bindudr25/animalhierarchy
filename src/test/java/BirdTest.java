import com.animal.bird.Bird;
import com.animal.bird.Chicken;
import com.animal.bird.Duck;
import com.animal.bird.Rooster;
import com.type.Gender;
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

    @Test
    public void testRoosterSay() {
        Rooster rooster = new Rooster();
        rooster.say();
        Assertions.assertEquals("Cock-a-doodle-doo", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testRoosterIsMaleChicken() {
        Rooster rooster = new Rooster();
        Assertions.assertEquals(Gender.MALE, rooster.getGender());
    }

    @Test
    public void testMaleChickenSay() {
        Chicken rooster = new Chicken(Gender.MALE);
        rooster.say();
        Assertions.assertEquals("Cock-a-doodle-doo", outputStreamCaptor.toString()
                .trim());
    }
}