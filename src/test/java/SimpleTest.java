import org.junit.Test;

public class SimpleTest {

    @Test
    public void greenTest() {
        System.out.println("this is the green test and you can see this message in log");
    }

    @Test
    public void redTest() {
        throw new NullPointerException();
    }

}
