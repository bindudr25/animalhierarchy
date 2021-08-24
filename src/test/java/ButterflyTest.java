import com.butterfly.AdultButterfly;
import com.butterfly.Catterpillar;
import org.junit.jupiter.api.Test;

public class ButterflyTest {
    @Test
    public void testBird(){
        Catterpillar butterfly = new Catterpillar();
        butterfly.eat();
        AdultButterfly adultButterfly = butterfly.metamorphosis();
        adultButterfly.fly();
    }

}
