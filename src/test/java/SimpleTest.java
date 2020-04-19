import org.junit.Test;

public class SimpleTest {

    @Test
    public void greenTest() {

    }

    @Test
    public void redTest() {
        throw new NullPointerException();
    }

}
