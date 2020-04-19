import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SimpleTest {

    @Test
    public void greenTest() {
        System.out.println("this is the green test and you can see this message in log");
    }

    @Test
    public void redTest() {
        throw new NullPointerException();
    }

    @Test
    public void randomTest() {
        Random random = new Random();

        // Generate random integers in range 0 to 9
        int randomNumber = random.nextInt(10);

        System.out.println(String.format("The number is %d", randomNumber));
        Assert.assertTrue(5 >= randomNumber);
    }

}
