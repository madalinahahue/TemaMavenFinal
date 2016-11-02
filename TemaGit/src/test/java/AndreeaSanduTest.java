import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ansandu on 11/2/2016.
 */
public class AndreeaSanduTest {
    @Test
    public void checkSum() {

        Assert.assertEquals((5 + 5), 10);
    }

    @Test
    public void testMultiply() {

        Assert.assertFalse(multiply(3, 5)>10, "Caught");
    }


    public int multiply(int x, int y) {
        return x / y;
    }


}
