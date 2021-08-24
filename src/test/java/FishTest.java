import com.animal.bird.*;
import com.fish.Fish;
import com.fish.Shark;
import com.type.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FishTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testFishSwim() {
        Fish fish = new Fish();
        fish.swim();
        Assertions.assertEquals("I am Swimming", outputStreamCaptor.toString()
                .trim());

    }


    @Test
    public void testSharkAreLargeAndGrey() {
        Shark shark = new Shark();
        Assertions.assertEquals("grey", shark.getColor());
        Assertions.assertEquals("large", shark.getSize());
        shark.eat();
        Assertions.assertEquals("I eat other fish", outputStreamCaptor.toString()
                .trim());
    }

}